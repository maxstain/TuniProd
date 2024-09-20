package tn.tuniprod.gestionmagasin.Models;

import java.util.Date;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.dateExpiration = dateExpiration;
    }

    public Produit(int id, String libelle, String marque, double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public void afficher() {
        if (this.prix == 0) {
            System.out.println("Produit: " + this.libelle + " de marque " + this.marque + " à " + this.dateExpiration);
        } else if (this.prix > 0) {
            System.out.println("Produit: " + this.libelle + " de marque " + this.marque + " à " + this.prix +
                    " TND" + " à " + this.dateExpiration);
        }
    }

    public void setPrix(double prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("Le prix doit être supérieur à 0");
        }
    }

    public double getPrix() {
        return this.prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Date getDateExpiration() {
        return this.dateExpiration;
    }

}
