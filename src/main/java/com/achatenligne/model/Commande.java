package com.achatenligne.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Commande {
	
	private List<Produit> produits = new ArrayList<Produit>();
	
	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.valueOf(0);
		for (Produit produit : produits) {
			total.add(produit.getPrix());
		}
		return total;
	}
	
	public void add(Produit produit) {
		produits.add(produit);
	}
	
	public List<Produit> getProduits() {
		return produits;
	}

}
