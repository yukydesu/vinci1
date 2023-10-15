//B6

public class DessinEtoile {

    public static void main(String[] args){

        Tortue tortue = new Tortue();

        tortue.accelerer();
        tortue.definirCouleur("ROUGE");
        tortue.avancer(100);
        tortue.tournerADroite(120);
        tortue.avancer(100);
        tortue.tournerADroite(120);
        tortue.avancer(100);
        tortue.tournerADroite(90);
        tortue.definirCouleur("NOIR");
        tortue.avancer(60);
        tortue.definirCouleur("BLEU");
        tortue.tournerADroite(90);
        tortue.avancer(100);
        tortue.tournerADroite(120);
        tortue.avancer(100);
        tortue.tournerADroite(120);
        tortue.avancer(100);
    }
}
