package al_dente0.me.investplace.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public Client findById(int id) {
        return repository.findById(id).get();
    }
    public void save(Client client) {
        repository.save(client);
    }
    public void delete(Client client) {
        repository.delete(client);
    }
}
