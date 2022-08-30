package com.projet.ServerGestionStock.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.ServerGestionStock.Service.IProduitService;
import com.projet.ServerGestionStock.entity.Produit;
import com.projet.ServerGestionStock.repository.ProduitRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/produit")

public class ProduitController {
	
	@Autowired
	private IProduitService produitservice;
	
	@Autowired
	private ProduitRepository produitRepository;
	
	
	@GetMapping
	public List<Produit> getProduit(){
		return produitservice.getProduit();
		
	}
	@PostMapping
	public void addProduit(@RequestBody Produit produit) {
		produitservice.addProduit(produit);
	}
	@PutMapping()
	public void updateProduit(@RequestBody Produit produit) {
		produitservice.updateProduit(produit);
	}
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		 produitservice.deleteProduit(id);
	}
	
	

}
