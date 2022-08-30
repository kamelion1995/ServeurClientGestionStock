package com.projet.ServerGestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.ServerGestionStock.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
