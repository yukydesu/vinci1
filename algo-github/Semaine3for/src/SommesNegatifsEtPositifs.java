import java.util.Scanner;

public class SommesNegatifsEtPositifs {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sommeEntiersPositif = 0;
        int sommeEntiersNegatif = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("entier " + i + " : ");
            int entier = scanner.nextInt();
            if (entier >= 0)
                sommeEntiersPositif += entier;
            else {
                sommeEntiersNegatif += entier;
            }
        }
        System.out.println("Somme des entiers positifs : " + sommeEntiersPositif);
        System.out.println("Somme des entier négatifs : " + sommeEntiersNegatif);
    }
}
