// Mini Projet 1 : Bonhomme de neige

public class MiniProjet1 {

    public static void main(String[] args) {
        Tortue tortue = new Tortue();
        tortue.accelerer();
        tortue.definirCouleur("BLANC");

        // Le corps
        for (int i = 0; i < 360; i++) {

            tortue.avancer(1.5);
            tortue.tournerADroite(1);
        }

        // La tête
        for (int j = 0; j < 360; j++) {

            tortue.avancer(0.5);
            tortue.tournerAGauche(1);
        }

        // Positionement
        tortue.tournerAGauche(90);
        tortue.definirCouleur("NOIR");
        tortue.avancer(25);
        tortue.tournerADroite(90);
        tortue.avancer(5);
        tortue.definirCouleur("BLANC");

        // Le nez
        for (int i = 0; i < 3; i++) {
            tortue.tournerADroite(120);
            tortue.avancer(10);
        }

        // Positionement
        tortue.definirCouleur("NOIR");
        tortue.tournerADroite(90);
        tortue.avancer(15);
        tortue.definirCouleur("BLANC");

        // Bouche
        tortue.tournerADroite(90);
        tortue.avancer(10);

        // Positionnement
        tortue.definirCouleur("NOIR");
        tortue.tournerADroite(90);
        tortue.avancer(15);
        tortue.tournerADroite(90);
        tortue.avancer(10);
        tortue.tournerAGauche(90);
        tortue.avancer(10);
        tortue.tournerADroite(90);
        tortue.avancer(5);
        tortue.definirCouleur("BLANC");

        // L'oeuil droit
        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.05);
            tortue.tournerADroite(1);
        }

        // Positionnement
        tortue.definirCouleur("NOIR");
        tortue.avancer(-20);
        tortue.definirCouleur("BLANC");

        // L'oeuil gauche
        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.05);
            tortue.tournerADroite(1);
        }

        // Positionnement
        tortue.definirCouleur("NOIR");
        tortue.avancer(10);
        tortue.tournerADroite(90);
        tortue.avancer(35);
        tortue.tournerAGauche(90);

        // Commencement des bouttons
        tortue.tournerADroite(90);
        tortue.definirCouleur("NOIR");
        tortue.avancer(35);
        tortue.tournerAGauche(90);
        tortue.avancer(14);
        tortue.tournerADroite(90);
        tortue.avancer(15);
        tortue.definirCouleur("BLANC");

        for (int i = 1; i < 360; i++) {
            tortue.avancer(0.2);
            tortue.tournerADroite(1);
        }

        tortue.definirCouleur("NOIR");
        tortue.avancer(40);
        tortue.definirCouleur("BLANC");

        for (int i = 1; i < 360; i++) {
            tortue.avancer(0.2);
            tortue.tournerADroite(1);
        }

        tortue.definirCouleur("NOIR");
        tortue.avancer(40);
        tortue.definirCouleur("BLANC");

        for (int i = 1; i < 360; i++) {
            tortue.avancer(0.2);
            tortue.tournerADroite(1);
        }

        // Positionnement
        tortue.definirCouleur("NOIR");
        for (int i = 0; i < 301; i++) {
            tortue.avancer(2);
            tortue.tournerAGauche(1);
        }

        // Bras droit
        tortue.definirCouleur("BLANC");
        tortue.tournerADroite(180);
        tortue.avancer(45);

        // Main droite
        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

        for (int i = 0; i < 420; i++) {
            tortue.avancer(0.1);
            tortue.tournerAGauche(1);
        }
        for (int i = 0; i < 670; i++) {
            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

        // Bras droite part 2
        tortue.tournerAGauche(55);
        tortue.avancer(55);

        // Positionnement
        tortue.definirCouleur("NOIR");
        tortue.tournerAGauche(190);
        for (int i = 0; i < 302; i++) {
            tortue.avancer(2);
            tortue.tournerAGauche(1);
        }
        tortue.definirCouleur("WHITE");

        // Bras gauche
        tortue.tournerADroite(180);
        tortue.avancer(45);

        // Main gauche
        for (int i = 0; i < 360; i++) {
            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

        for (int i = 0; i < 420; i++) {
            tortue.avancer(0.1);
            tortue.tournerAGauche(1);
        }
        for (int i = 0; i < 670; i++) {
            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }
        // Bras gauche part 2
        tortue.tournerAGauche(55);
        tortue.avancer(44);

        // Positionnement
        tortue.definirCouleur("NOIR");
        for (int i = 0; i < 200; i++) {
            tortue.avancer(0.94);
            tortue.tournerAGauche(1);
        }
        tortue.definirCouleur("BLANC");

        // Chepeau
        tortue.definirCouleur("NOIR");
        tortue.tournerAGauche(180);
        tortue.avancer(187);
        tortue.definirCouleur("BLANC");
        tortue.tournerADroite(90);
        tortue.avancer(35);
        tortue.tournerAGauche(90);
        tortue.avancer(25);
        tortue.tournerAGauche(90);
        tortue.avancer(20);
        tortue.tournerADroite(90);
        tortue.avancer(20);
        tortue.tournerAGauche(90);
        tortue.avancer(30);
        tortue.tournerAGauche(90);
        tortue.avancer(20);
        tortue.tournerADroite(90);
        tortue.avancer(20);
        tortue.tournerAGauche(90);
        tortue.avancer(25);
        tortue.tournerAGauche(90);
        tortue.avancer(35);
    }
}