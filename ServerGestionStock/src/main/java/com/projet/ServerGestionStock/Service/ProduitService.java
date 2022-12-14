package com.projet.ServerGestionStock.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.projet.ServerGestionStock.entity.Produit;
import com.projet.ServerGestionStock.repository.ProduitRepository;

@Service
@Primary
public class ProduitService implements IProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getProduit() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produitRepository.delete(produit);
		// TODO Auto-generated method stub
		
	}

}
