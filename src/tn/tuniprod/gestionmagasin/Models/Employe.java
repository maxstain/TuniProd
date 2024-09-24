package tn.tuniprod.gestionmagasin.Models;

public class Employe {
    private int id;
    private String nom;
    private String addresse;
    private int nbr_heures;

    public Employe() {
    }

    public Employe(int id, String nom, String addresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.addresse = addresse;
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", addresse='" + addresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public void afficher() {
        System.out.println("Employe: \n" + "\t- Nom: " + this.nom + "\n\t- Adresse: " + this.addresse + "\n\t- Nombre d'heures: " + this.nbr_heures + "\n");
    }
}
