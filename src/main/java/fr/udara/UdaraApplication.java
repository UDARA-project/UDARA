package fr.udara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import fr.udara.batch.IntegrationAPI;
import fr.udara.batch.IntegrationFile;
import fr.udara.service.CommuneService;

/**
 *  @SpringBootApplication est une annotation pratique qui ajoute tous les éléments suivants:
 *  @Configuration.
 *  @EnableAutoConfiguration
 *  @ComponentScan.
 *  
 *  @EnableScheduling
 *  Un déclenchement est réalisé tous les jours à 6h00, 12h00 et 18h00 dans la classe IntegrationAPI méthode traite()
 * 
 */
@SpringBootApplication
@EnableScheduling
public class UdaraApplication implements CommandLineRunner {

	@Autowired
	private IntegrationAPI integrationAPI;
	@Autowired
	private CommuneService communeService;
	
	public static void main(String[] args) {
		SpringApplication.run(UdaraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		IntegrationFile integrationFile = new IntegrationFile(communeService);
		integrationFile.traite();
		//this.integrationAPI.traite();
		

	}

	
}
