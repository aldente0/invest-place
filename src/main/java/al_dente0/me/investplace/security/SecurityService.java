package al_dente0.me.investplace.security;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {
    private final SecurityRepository repository;
    public SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    public List<Security> findAll() {
        return repository.findAll();
    }

    public Security findById(Long id) {
        return repository.findById(id).get();
    }

    public void save(Security security) {repository.save(security);
    }
}
