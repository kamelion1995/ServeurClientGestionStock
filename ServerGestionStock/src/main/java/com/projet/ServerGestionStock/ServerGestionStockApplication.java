package com.projet.ServerGestionStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.projet.ServerGestionStock.entity.Produit;
import com.projet.ServerGestionStock.repository.ProduitRepository;

@SpringBootApplication
public class ServerGestionStockApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx = SpringApplication.run(ServerGestionStockApplication.class, args);
		ProduitRepository produitRepository= cx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("livre3", 50, 30));
		produitRepository.save(new Produit("cahier", 30, 60));
		produitRepository.save(new Produit("stylo", 50, 20));
	}

}
