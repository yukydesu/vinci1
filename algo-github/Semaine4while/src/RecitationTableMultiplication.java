public class RecitationTableMultiplication {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        int entierHasard = unEntierAuHasardEntre(1, 10);
        int reponseMultiplication = 0;
        int compteur = 1;
        int reponseUser = 0;
        System.out.println("Tu vas donner la table de multiplication par " + entierHasard + " : ");
        do {
            System.out.print(compteur + " X " + entierHasard + " = ");
            reponseUser = scanner.nextInt();
            reponseMultiplication = compteur * entierHasard;
            compteur ++;

        }while (compteur <= 10 && reponseUser == reponseMultiplication);

        if(reponseUser == reponseMultiplication)
            System.out.println("Félicitation !");
        else{
            System.out.println("Non c’est faux, la bonne réponse est " + reponseMultiplication);
        }
    }
        public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
            return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;}
}
