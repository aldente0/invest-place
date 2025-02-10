package al_dente0.me.investplace.t_api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

// DTO для фронта
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StockDto {
    private String figi;
    private String currency;
    private String ticker;
    private String name;
    private String uid;
    private Double price;

    public StockDto() {}

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getFigi() {
        return figi;
    }

    public void setFigi(String figi) {
        this.figi = figi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "StockDto{" +
                "figi='" + figi + '\'' +
                ", ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}