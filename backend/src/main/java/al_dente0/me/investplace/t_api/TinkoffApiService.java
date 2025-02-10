package al_dente0.me.investplace.t_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tinkoff.piapi.contract.v1.*;
import ru.tinkoff.piapi.core.InvestApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TinkoffApiService {


    private final InvestApi api;
    private final StockMapper stockMapper = StockMapper.INSTANCE;

    @Autowired
    public TinkoffApiService(InvestApi api) {
        this.api = api;
    }

    public List<StockDto> getStocks() {
        List<StockDto> stockDtos = api.getInstrumentsService().getTradableSharesSync()
                .stream()
                .map(stockMapper::toDto)
                .collect(Collectors.toList());

        List<String> uid = stockDtos.stream().map(StockDto::getUid).collect(Collectors.toList());
        Map<String, Double> lastPrices = getLastPrices(uid);

        stockDtos.forEach(stockDto -> stockDto.setPrice(lastPrices.getOrDefault(stockDto.getUid(), 0.0)));

        return stockDtos;
    }

    private Map<String, Double> getLastPrices(List<String> uids) {

        var response = api.getMarketDataService().getLastPricesSync(uids);

        return response.stream().collect(Collectors.toMap(
                LastPrice::getInstrumentUid,
                price -> price.getPrice().getUnits() + price.getPrice().getNano() / 1_000_000_000.0
        ));

    }
}
