package Test;

import tn.tuniprod.gestionmagasin.Models.*;

class MainTest {

    @org.junit.jupiter.api.Test
    public void main() {
        try {
            Employe employe = new Employe(1, "Mohamed", "Tunis", 300);
            if (employe.calculeSalaire() == 180 * 5 + (200 - 180) * 1.15) {
                System.out.println("Test cassier.calculeSalaire() passed");
            } else {
                throw new Exception("Test cassier.calculeSalaire() failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}