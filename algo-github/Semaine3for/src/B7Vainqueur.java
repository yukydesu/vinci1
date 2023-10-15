public class B7Vainqueur {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int numVainqueur = 0;
        int resultMax = 0;
        int resultMax2 = 0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Entrez le résultat du particpant n°" + i + " : ");
            int result = scanner.nextInt();
            if (result == resultMax)
                resultMax2 = resultMax;
            if (result > resultMax) {
                resultMax = result;
                numVainqueur = i;}
        }
        if(resultMax == resultMax2)
            System.out.println("Le vainqueur est le n°" + numVainqueur + " avec un résultat de : " +
                    resultMax + "\n(Il y'a ex-aequo avec un autre participant)");
        else{
            System.out.println("Le vainqueur est le n°" + numVainqueur + " avec un résultat de : " +
                    resultMax);
        }
    }
}
