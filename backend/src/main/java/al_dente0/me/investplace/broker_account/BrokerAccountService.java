package al_dente0.me.investplace.broker_account;

import org.springframework.stereotype.Service;

@Service
public class BrokerAccountService {
    private BrokerAccountRepository brokerAccountRepository;
    public BrokerAccountService(BrokerAccountRepository brokerAccountRepository) {
        this.brokerAccountRepository = brokerAccountRepository;
    }

    public BrokerAccount findById(int id) {
        return brokerAccountRepository.getById(id);
    }

    public void save(BrokerAccount brokerAccount) {
        brokerAccountRepository.save(brokerAccount);
    }

}
