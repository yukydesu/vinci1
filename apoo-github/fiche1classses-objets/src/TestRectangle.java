// Exercices 3.2
public class TestRectangle {

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(5.00, 3.00);
        Rectangle rectangle2 = new Rectangle(10.00, 6.00);
        Rectangle rectangle3 = new Rectangle(8.00, 2.00);

        System.out.println("Air du premier rectangle = " + rectangle1.calculerAire() + " cm");
        System.out.println("Périmètre du 2eme rectangle = " + rectangle2.calculerPerimetre() + " cm");
        System.out.println("Etat du 3eme rectangle : " +
                "\nLongueur = " + rectangle3.longueur + " cm" +
                "\nLargeur = " + rectangle3.largeur + " cm");

    }

}
