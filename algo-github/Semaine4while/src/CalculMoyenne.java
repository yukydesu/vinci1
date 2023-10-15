public class CalculMoyenne {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        char reponse;
        int liste = 0;
        int compteur = 0;
        do {
            System.out.print("Veuillez introduire un entier : ");
            int entier = scanner.nextInt();
            compteur ++;
            liste += entier;
            System.out.print("Voulez vous continuez ?");
            reponse = scanner.next().charAt(0);
        } while (reponse == 'Y' || reponse == 'y' || reponse == 'O' || reponse == 'o');
        System.out.println("Moyenne : " + (liste/compteur));
    }
}
