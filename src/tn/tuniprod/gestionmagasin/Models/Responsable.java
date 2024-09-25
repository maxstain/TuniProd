package tn.tuniprod.gestionmagasin.Models;

public class Responsable extends Employe {
    private double prime;

    public Responsable() {
    }

    public Responsable(int id, String nom, String addresse, int nbr_heures, double prime) {
        super(id, nom, addresse, nbr_heures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public double calculeSalaire() {
        if (this.getNbr_heures() < 160) {
            return (this.getNbr_heures() * 10) + this.prime;
        } else {
            return ((160 * 10) + (this.getNbr_heures() - 160) * 1.20) + this.prime;
        }
    }
}
