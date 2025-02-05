package al_dente0.me.investplace.brokerage_account_position;

import al_dente0.me.investplace.broker_account.BrokerAccount;
import al_dente0.me.investplace.client.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "broker_account_positions", schema = "public")
public class BrokerageAccountPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "broker_account_id")
    private BrokerAccount brokerAccount;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
