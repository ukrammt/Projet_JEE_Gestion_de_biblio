package org.xproce.gestion_bibliotheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionBibliothequeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionBibliothequeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
	}


}
