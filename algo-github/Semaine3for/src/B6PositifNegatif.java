public class B6PositifNegatif {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int nombreDePositif = 0;
        int nombreDeNegatif = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Entrez l'entier " + i + " : ");
            int entier = scanner.nextInt();
            if(entier < 0)
                nombreDeNegatif ++;
            else {nombreDePositif ++;}
        }
        System.out.println("Nombre de positif : " + nombreDePositif +
                "\nNombre de négatif : " + nombreDeNegatif);
    }
}
