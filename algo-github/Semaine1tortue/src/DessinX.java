//A3
public class DessinX {

    public static void main(String[] args){

        Tortue tortue = new Tortue();

        tortue.definirCouleur("VERT");
        tortue.accelerer();

        tortue.tournerADroite(60);
        tortue.avancer(100);
        tortue.tournerAGauche(120);
        tortue.avancer(100);
        tortue.tournerAGauche(180);
        tortue.avancer(200);
        tortue.tournerAGauche(180);
        tortue.avancer(100);
        tortue.tournerADroite(120);
        tortue.avancer(100);

    }
}
