package al_dente0.me.investplace.t_api;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.tinkoff.piapi.contract.v1.Share;

@Mapper(componentModel = "spring")
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);

    @Mapping(target = "price", ignore = true) // Пока игнорируем цену
    StockDto toDto(Share share);
}
