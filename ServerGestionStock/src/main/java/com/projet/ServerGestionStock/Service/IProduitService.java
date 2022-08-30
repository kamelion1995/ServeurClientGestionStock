package com.projet.ServerGestionStock.Service;

import java.util.List;

import com.projet.ServerGestionStock.entity.Produit;

public interface IProduitService {
	
	List <Produit> getProduit();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(Long id);

}
