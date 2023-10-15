public class CalculBMI {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ce programme calcul le BMI.");
        System.out.print("Veuillez introduire un poids (en kg) : ");
        double poids = scanner.nextDouble();
        System.out.print("Veuillez introduire une taille (en m) : ");
        double taille = scanner.nextDouble();
        double bmi = (poids / (taille* taille));
        String etat = "";
        if(bmi > 30)
            etat = "obèse";
        else{
            if(bmi < 20)
                etat = "mince";
            else {
                etat = "normal";
                }
            }
        System.out.println("Le BMI est de : " + Math.round(bmi * 100.0) / 100.0 +
                "\nConsidération : " + etat);
        }
        }