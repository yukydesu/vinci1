import java.util.Scanner;

public class C2Calendrier {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nombre de jours dans le mois : ");
        int nombreJours = scanner.nextInt();
        System.out.print("Le premier du mois tombe un : ");
        String next = scanner.nextLine(); ////// ???????????
        String premierDuMois = scanner.nextLine();
        int nJour = 0;

        if(premierDuMois.equalsIgnoreCase("mardi"))
            nJour = 1;
        if(premierDuMois.equalsIgnoreCase("mercredi"))
            nJour = 2;
        if(premierDuMois.equalsIgnoreCase("jeudi"))
            nJour = 3;
        if(premierDuMois.equalsIgnoreCase("vendredi"))
            nJour = 4;
        if(premierDuMois.equalsIgnoreCase("samedi"))
            nJour = 5;
        if(premierDuMois.equalsIgnoreCase("dimanche"))
            nJour = 6;
        System.out.println("Lu\tMa\tMe\tJe\tVe\tSa\tDi");
        System.out.print(" \t".repeat(nJour));
        for (int i = 1 ; i <= nombreJours ; i++) {
            if(((i - 1) + nJour) % 7 == 0)
                System.out.print("\n");
            System.out.print(i + "\t");
        }
    }
}
