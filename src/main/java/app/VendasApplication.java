package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
/*
    Esses dois decoradores servem para pegar a configuração de Config
    @Autowired
    @Qualifier("applicationName")
*/
    @Value("${application.name}")
    private String applicationName;

    @GetMapping("hello")
    public String helloWord() {
        return this.applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
