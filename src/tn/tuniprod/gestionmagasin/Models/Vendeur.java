package tn.tuniprod.gestionmagasin.Models;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(int id, String nom, String addresse, int nbr_heures, double tauxDeVente) {
        super(id, nom, addresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
}
