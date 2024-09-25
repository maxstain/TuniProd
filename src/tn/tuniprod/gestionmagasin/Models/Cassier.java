package tn.tuniprod.gestionmagasin.Models;

public class Cassier extends Employe {
    private int numeroDeCaisse;

    public Cassier() {
    }

    public Cassier(int id, String nom, String addresse, int nbr_heures, int numeroDeCaisse) {
        super(id, nom, addresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
}
