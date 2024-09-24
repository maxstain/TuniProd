import tn.tuniprod.gestionmagasin.Models.*;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Carrefour", "Centre ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Ariana");

        m1.ajoutEmploye(new Cassier(1, "Ali", "Tunis", 40, 500));
        m1.ajoutEmploye(new Cassier(2, "Ahmed", "Ariana", 40, 500));
        m1.ajoutEmploye(new Vendeur(3, "Mohamed", "Ben Arous", 40, 500));
        m1.ajoutEmploye(new Responsable(4, "Sami", "Marsa", 40, 500));

        m2.ajoutEmploye(new Cassier(5, "Ali", "Tunis", 40, 500));
        m2.ajoutEmploye(new Vendeur(6, "Ahmed", "Ariana", 40, 500));
        m2.ajoutEmploye(new Vendeur(7, "Ali", "Tunis", 40, 500));
        m2.ajoutEmploye(new Vendeur(8, "Omar", "Ariana", 40, 500));
        m2.ajoutEmploye(new Responsable(9, "Mohamed", "Ben Arous", 40, 500));

        for (Employe e : m1.getEmployes()) {
            System.out.println(e);
        }
        for (Employe e : m2.getEmployes()) {
            System.out.println(e);
        }
    }
}