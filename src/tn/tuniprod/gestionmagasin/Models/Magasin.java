package tn.tuniprod.gestionmagasin.Models;

public class Magasin {
    private int id;
    private String addresse;
    private final int CAPACITE = 50;
    private final Produit[] produits = new Produit[CAPACITE];

    public Magasin(int id, String addresse) {
        this.id = id;
        this.addresse = addresse;
    }

    public void ajoutProduit(Produit produit) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null) {
                produits[i] = produit;
                break;
            }
        }
    }

    public void afficher() {
    System.out.println("Magasin: " + this.id + " à " + this.addresse);
    for (Produit produit : produits) {
        if (produit != null) {
            System.out.println("Produit: \n" + "\t- Nom: " + produit.getLibelle() + "\n\t- Prix: " + produit.getPrix() + " TND");
        }
    }
    System.out.println("\n");
}

    public int getNombreProduits() {
        return produits.length;
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

    public int getCapacite() {
        return CAPACITE;
    }

    public Produit[] getProduits() {
        return produits;
    }
}
