package tn.tuniprod.gestionmagasin.Models;

public class Magasin {
    private int id;
    private String Nom;
    private String addresse;
    private final int CAPACITE = 50;
    private final Produit[] produits = new Produit[CAPACITE];
    private final Employe[] employes = new Employe[20];

    public Magasin() {
    }

    public Magasin(int id, String Nom, String addresse) {
        this.id = id;
        this.Nom = Nom;
        this.addresse = addresse;
    }

    public void ajoutProduit(Produit produit) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] == null) {
                produits[i] = produit;
                break;
            }
        }
    }

    public void afficher() {
        System.out.println("Magasin: " + this.id + " à " + this.addresse + " de capactié: " + this.CAPACITE);
        System.out.println("Produits:" + "Nombre de produits: " + this.getNombreProduits());
        for (Produit produit : produits) {
            if (produit != null) {
                System.out.println("* Produit: \n" + "\t- Nom: " + produit.getLibelle() + "\n\t- Prix: " + produit.getPrix() + " TND\n");
            }
        }
        System.out.println("Employes:");
        for (Employe employe : employes) {
            if (employe != null) {
                System.out.println("* Employe: \n" + "\t- Nom: " + employe.getNom() + "\n\t- Adresse: " + employe.getAddresse()
                        + "\n\t- Nombre d'heures: " + employe.getNbr_heures()
                        + "\n\t- Salaire: " + employe.calculeSalaire() + "\n"
                );
            }
        }
        affichePrimeEmployes();
        System.out.println("--------------------------------------------------");
        System.out.println("\n");
    }

    public int getNombreProduits() {
        return produits.length;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getCapacite() {
        return CAPACITE;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public static boolean comparer(Magasin m1, Magasin m2) {
        return m1 == m2;
    }

    public boolean comaprer(Magasin m) {
        return this == m;
    }

    public boolean chercherProduit(Produit produit) {
        for (Produit p : produits) {
            if (p != null && p.comparer(produit)) {
                return true;
            }
        }
        return false;
    }

    public static Magasin magasinAvecPlusDeProduits(Magasin m1, Magasin m2) {
        return m1.getNombreProduits() > m2.getNombreProduits() ? m1 : m2;
    }

    public void ajoutEmploye(Employe employe) {
        for (int i = 0; i < employes.length; i++) {
            if (employes[i] == null) {
                employes[i] = employe;
                break;
            }
        }
    }

    public Employe[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employe[] employes) {
        for (int i = 0; i < employes.length; i++) {
            this.employes[i] = employes[i];
        }
    }

    public void afficheSalaires() {
        for (Employe employe : employes) {
            if (employe != null) {
                System.out.println("Salaire de " + employe.getNom() + " est " + employe.calculeSalaire());
            }
        }
    }

    public void affichePrimeEmployes() {
        double prime = 0;
        for (Employe employe : employes) {
            if (employe != null && employe.getClass() == Responsable.class) {
                prime += ((Responsable) employe).getPrime();
            }
        }

        System.out.println("La prime des responsables est " + prime);
    }


}
