//B1
public class DessinCarre {

    public static void main(String[] args){

        Tortue tortue = new Tortue();

        tortue.definirCouleur("VERT");
        tortue.accelerer();
        tortue.tournerADroite(90);
        tortue.avancer(100);
        tortue.tournerAGauche(90);
        tortue.avancer(100);
        tortue.tournerAGauche(90);
        tortue.avancer(100);
        tortue.tournerAGauche(90);
        tortue.avancer(100);

    }
}
