public class NombreMystere {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        int entierHasard = unEntierAuHasardEntre(0, 100);
        System.out.println("J'ai choisis un entier au hasard, essaie de le deviner !");
        int entierUser = scanner.nextInt();
        int essaie= 1;
        while(entierHasard != entierUser) {
            System.out.print("FAUX : ");
            if(entierUser > entierHasard)
                System.out.println("Trop grand !");
            else{
                System.out.println("Trop petit !");
            }
            entierUser = scanner.nextInt();
            essaie ++;
        }
        System.out.println("Bravo ! l'a trouvé en " + essaie + " essaies.");




    }
    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;}
}
