import tn.tuniprod.gestionmagasin.Models.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Carrefour", "Centre ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Ariana");


        // Ajout des employes dans magasin 1
        m1.ajoutEmploye(new Cassier(1, "Ali", "Tunis", 40, 500));
        m1.ajoutEmploye(new Cassier(2, "Ahmed", "Ariana", 40, 500));
        m1.ajoutEmploye(new Vendeur(3, "Mohamed", "Ben Arous", 40, 500));
        m1.ajoutEmploye(new Responsable(4, "Sami", "Marsa", 40, 500));

        // Ajout des employes dans magasin 2
        m2.ajoutEmploye(new Cassier(5, "Ali", "Tunis", 40, 500));
        m2.ajoutEmploye(new Vendeur(6, "Ahmed", "Ariana", 40, 500));
        m2.ajoutEmploye(new Vendeur(7, "Ali", "Tunis", 40, 500));
        m2.ajoutEmploye(new Vendeur(8, "Omar", "Ariana", 40, 500));
        m2.ajoutEmploye(new Responsable(9, "Mohamed", "Ben Arous", 40, 500));

        // Affichage des employes du magasin 1
        System.out.println("Employes du magasin 1");
        for (Employe e : m1.getEmployes()) {
            if (e != null) {
                System.out.println(e);
            }
        }

        // Affichage des employes du magasin 2
        System.out.println("Employes du magasin 2");
        for (Employe e : m2.getEmployes()) {
            if (e != null) {
                System.out.println(e);
            }
        }

        // Ajout des produits dans magasin 1
        m1.ajoutProduit(new Produit(1, "Lait", "Vitalait", 1.5, new Date()));
        m1.ajoutProduit(new Produit(2, "Yaourt", "Vitalait", 1.5, new Date()));
        m1.ajoutProduit(new Produit(3, "Fromage", "Vitalait", 1.5, new Date()));

        // Ajout des produits dans magasin 2
        m2.ajoutProduit(new Produit(4, "Lait", "Vitalait", 1.5, new Date()));
        m2.ajoutProduit(new Produit(5, "Yaourt", "Vitalait", 1.5, new Date()));
        m2.ajoutProduit(new Produit(6, "Fromage", "Vitalait", 1.5, new Date()));

        // Affichage du magasin 1
        m1.afficher();

        // Affichage du magasin 2
        m2.afficher();
    }
}