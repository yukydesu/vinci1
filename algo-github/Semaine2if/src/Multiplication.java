public class Multiplication{

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Entrainement aux multiplications. Voici un exercice :");
		
		int nombre1 = unEntierAuHasardEntre (0, 10);
		int nombre2 = unEntierAuHasardEntre (0, 10);
		System.out.print("Calculez : " + nombre1 + " x " + nombre2 + " = ");
		int reponseReel = nombre1 * nombre2;
		int reponseUtilisateur = scanner.nextInt();
		if(reponseReel == reponseUtilisateur) {
			System.out.println("Bravo !");
		}else{
			System.out.println("Faux ! la réponse est : " + reponseReel);
		}
	}
	public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
		return (int)((Math.random() * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale);
	}
}