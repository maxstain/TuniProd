package tn.tuniprod.gestionmagasin.Models;

public class Responsable extends Employe {
    private int id;
    private String nom;
    private String addresse;
    private int nbr_heures;
    private double salaire;

    public Responsable() {
    }

    public Responsable(int id, String nom, String addresse, int nbr_heures, double salaire) {
        this.id = id;
        this.nom = nom;
        this.addresse = addresse;
        this.nbr_heures = nbr_heures;
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
