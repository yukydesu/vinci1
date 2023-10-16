public class NombreMystereInverse {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int essaie = 0;
        int nombreTrouver = 50;
        System.out.println("Je vais essayer de deviner ton nombre entre 0 et 100 !");
        System.out.println("Tape '-' ou '+' pour me guider et tape '=' si je l'ai deviné !");
        char correctionUser;
        int max = 100;
        int min = 0;
        do {
            System.out.print("Je pense à " + nombreTrouver + " : ");
            essaie++;
            correctionUser = scanner.next().charAt(0);

            if (correctionUser == '-') {
                max = nombreTrouver;
                nombreTrouver = nombreTrouver - ((nombreTrouver - min) / 2);
            }
            else if (correctionUser == '+') {
                min = nombreTrouver;
                nombreTrouver = nombreTrouver + ((max - nombreTrouver) / 2);
            }
            else {
                System.out.println("Je l'ai deviné en " + essaie + " essaies :)");
            }
        }while ((essaie < 10) && (correctionUser != '='));

        if(essaie == 10)
            System.out.println("Après 10 essaies, je n'ai pas trouver... :(");
    }
} 