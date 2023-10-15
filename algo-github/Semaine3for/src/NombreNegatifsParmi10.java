import java.util.Scanner;

public class NombreNegatifsParmi10 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nombreNegatif = 0;

        for (int i = 1; i <= 10 ; i++) {

            System.out.print("entier " + i + " : ");
            int nEntier = scanner.nextInt();
            if(nEntier < 0)
                nombreNegatif ++;
        }
        System.out.println("nombre de négatif : " + nombreNegatif);
    }
}
