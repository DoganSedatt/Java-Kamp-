package kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.Devs.dataAccess.abstracts.ILanguageRepo;
import kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepo;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);
	}

}
