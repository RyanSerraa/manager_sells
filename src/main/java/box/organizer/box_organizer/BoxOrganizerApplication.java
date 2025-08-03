package box.organizer.box_organizer;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoxOrganizerApplication {

	public static void main(String[] args) {
		// Carrega o arquivo .env na variável dotenv
		Dotenv dotenv = Dotenv.load();

		// Define as variáveis do .env no System, para que o Spring Boot consiga resolver no application.properties
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		// Opcional: teste no console
		System.out.println("DB_URL: " + System.getProperty("DB_URL"));

		// Inicia a aplicação Spring Boot
		SpringApplication.run(BoxOrganizerApplication.class, args);
	}
}
