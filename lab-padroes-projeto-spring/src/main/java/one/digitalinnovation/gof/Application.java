package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os sesguintes módulos foram selecionados:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 *
 * @author silvanors
 * */
@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	

}
