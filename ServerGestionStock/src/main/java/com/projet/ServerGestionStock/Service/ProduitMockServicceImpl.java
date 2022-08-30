package com.projet.ServerGestionStock.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.projet.ServerGestionStock.entity.Produit;

@Service
public class ProduitMockServicceImpl implements IProduitService {

	public List<Produit> produits;
	
	public ProduitMockServicceImpl() {
		
		produits=new ArrayList<Produit>();
		
		produits.add(new Produit("livre3", 50, 30));
		produits.add(new Produit("cahier", 30, 60));
		produits.add(new Produit("stylo", 50, 20));
	}
	
	@Override
	public List<Produit> getProduit() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
	   produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
	produits.remove(produit);
	produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long  id) {
	    Produit produit= new Produit();
	    produit.setId(id);
	    produits.remove(produit);
		
	}

}
