
public class Multiplication3Essais {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entrainement aux multiplications. Voici une multiplication :");
		System.out.println("Tu as droit a 3 essais");
		int premierNombre = unEntierAuHasardEntre (0, 10);
		int secondNombre = unEntierAuHasardEntre (0, 10);
		int essaie = 3;
		int input;
		int reponse = premierNombre * secondNombre;
		do{
			System.out.println("Essaie restant : " + essaie);
			System.out.print("Calculez : " + premierNombre + " x " + secondNombre + " = ");
			input = scanner.nextInt();
			essaie --;
		}while(input != reponse && essaie > 0);

		if(input == reponse)
			System.out.println("Bravo !");
		else{
			System.out.println("Vous n'avez plus d'essaie...");
		}
	}

	// A NE PAS MODIFIER
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int) (Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
	}
	
}
