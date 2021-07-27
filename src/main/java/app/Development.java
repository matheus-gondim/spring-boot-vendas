package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// @Configuration => Serve para mostrar ao Spring que essa é uma classe de configuração
@Configuration
// Serve para indicar que essa configuração so vai estar disponivel para um determinado ambiente
@Profile("development")
public @interface Development {
}
