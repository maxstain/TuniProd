package tn.tuniprod.gestionmagasin.Models;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, marque, prix, dateExpiration);
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

    public boolean comparer(Produit p1) {
        return p1.marque.equals(this.marque) && p1.libelle.equals(this.libelle) && p1.prix == this.prix;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return p1.marque.equals(p2.marque) && p1.libelle.equals(p2.libelle) && p1.prix == p2.prix;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
