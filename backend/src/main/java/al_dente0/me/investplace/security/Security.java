package al_dente0.me.investplace.security;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "securities", schema = "public")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "ticker", nullable = false, unique = true)
    private String ticker;
    @Column(name = "current_price", nullable = false)
    private BigDecimal currentPrice;
    @Column(name = "currency", nullable = false)
    private String currency;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
