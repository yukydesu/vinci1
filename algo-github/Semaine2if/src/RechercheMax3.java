
public class RechercheMax3 {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Entrez l'entier 1 : ");
		int entier1 = scanner.nextInt();
		System.out.print("Entrez l'entier 2 : ");
		int entier2 = scanner.nextInt();
		System.out.print("Entrez l'entier 3 : ");
		int entier3 = scanner.nextInt();

		if(entier1 > entier2 && entier1 > entier3){					// <-- A COMPLETER (il faut remplacer true par une expression booleenne adequate
			System.out.println("Le plus grand entier est "+entier1 );
		}else{ 
			if(entier2 > entier3){				// <-- A COMPLETER
				System.out.println("Le plus grand entier est "+entier2 );
			}else{
				System.out.println("Le plus grand entier est "+entier3 );
			}
		}

	}
}
