public class RechercheMax2 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entier 1 : ");
        int entier1 = scanner.nextInt();
        System.out.print("Entier 2 : ");
        int entier2 = scanner.nextInt();
        if (entier1 > entier2) {
            System.out.println("Max : " + entier1);
        } else {
            System.out.println("Max : " + entier2);
        }
    }
}