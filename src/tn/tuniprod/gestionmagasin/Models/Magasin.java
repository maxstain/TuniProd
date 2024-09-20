package tn.tuniprod.gestionmagasin.Models;

import java.util.ArrayList;

public class Magasin {
    private int id;
    private String addresse;
    private int capacite = 50;
    private ArrayList<Produit> produits = new ArrayList<>();

    public Magasin(int id, String addresse) {
        this.id = id;
        this.addresse = addresse;
    }

    public void ajoutProduit(Produit produit) {
        if (produits.size() < capacite) {
            produits.add(produit);
        } else {
            System.out.println("Le magasin est plein");
        }
    }

    public void afficher() {
        System.out.println("Magasin: " + this.id + " à " + this.addresse);
        for (Produit produit : produits) {
            System.out.println("Produit: \n" + "\t- Nom: " + produit.getLibelle() + "\n\t- Prix: " + produit.getPrix() + " TND");
        }
        System.out.println("\n");
    }

    public int getNombreProduits() {
        return produits.size();
    }

    public int getId() {
        return id;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }
}
