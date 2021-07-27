package app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class Config {

    @Bean(name = "applicationName")
    public CommandLineRunner executar(){
        return args -> System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
    }

}
