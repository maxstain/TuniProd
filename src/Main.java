import tn.tuniprod.gestionmagasin.Models.Magasin;
import tn.tuniprod.gestionmagasin.Models.Produit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magasin m1 = new Magasin(100, "Tunis");
        Magasin m2 = new Magasin(101, "Ariana");
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "Lait", "Delise", new Date());
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait", new Date());
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.200, new Date());

        p2.setPrix(0.700);

        p1.setId(1000);
        p1.setLibelle("Biscuit");
        p1.setMarque("Campel");
        p1.setPrix(2.500);
        p3.setId(1002);
        p3.setLibelle("Jus d'orange");
        p3.setMarque("Oh");
        p3.setPrix(1.500);

        m1.ajoutProduit(p1);
        m1.ajoutProduit(p2);
        m2.ajoutProduit(p3);
        m2.ajoutProduit(p4);
        m1.afficher();
        m2.afficher();

        System.out.println("Nombre totale des produits dans tout les magasins: "
                + (m1.getProduits().length + m2.getProduits().length));
    }
}