package al_dente0.me.investplace.t_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    private final TinkoffApiService tinkoffApiService;
    public StockController(TinkoffApiService tinkoffApiService) {
        this.tinkoffApiService = tinkoffApiService;
    }

    @GetMapping
    public List<StockDto> getAllStocks() {
        StockDto dto = tinkoffApiService.getStocks().getFirst();
        System.out.println(dto);
        return tinkoffApiService.getStocks(); // Spring сам конвертирует в JSON
    }
}
