//B5
public class DessinPriseElectrique {
    public static void main(String[] args) {

        Tortue tortue = new Tortue();

        tortue.accelerer();
        tortue.definirCouleur("VERT");

        //1er rond
        for (int i = 0; i < 360 ; i++) {

            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

        //Replacement
        tortue.avancer(3);
        tortue.definirCouleur("NOIR");
        tortue.avancer(25);
        tortue.definirCouleur("VERT");

        //2eme rond
        for (int j =0; j < 360 ; j++) {

            tortue.avancer(0.1);
            tortue.tournerADroite(1);
        }

        //Replacement
        tortue.avancer(-3);
        tortue.definirCouleur("NOIR");
        tortue.avancer(-12.5);
        tortue.tournerAGauche(90);
        tortue.avancer(50);
        tortue.tournerADroite(90);

        //Dernier Rond
        tortue.definirCouleur("VERT");

        for (int j =0; j < 360 ; j++) {

            tortue.avancer(1);
            tortue.tournerADroite(1);
        }
    }
}
