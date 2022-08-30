package com.projet.ServerGestionStock.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Produit {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
	private String ref;
	
	private int quantite;
	
	private float prixUnitaire;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String ref, int quantite, float prixUnitaire) {
		super();
		this.ref = ref;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return Objects.equals(id, other.id);
	}

}
