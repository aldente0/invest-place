package al_dente0.me.investplace;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import ru.tinkoff.piapi.core.InvestApi;

@Configuration
public class AppConfig {

    @Value("${tinkoff.api.token}")
    private String apiToken;

    @Bean
    public InvestApi investApi() {
        return InvestApi.create(apiToken);
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
