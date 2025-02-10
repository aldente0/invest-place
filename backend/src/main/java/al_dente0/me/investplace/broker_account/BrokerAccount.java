package al_dente0.me.investplace.broker_account;

import al_dente0.me.investplace.brokerage_account_position.BrokerageAccountPosition;
import al_dente0.me.investplace.client.Client;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "broker_accounts", schema = "public")
public class BrokerAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_number")
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "brokerAccount", cascade = CascadeType.ALL)
    private List<BrokerageAccountPosition> positions = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
