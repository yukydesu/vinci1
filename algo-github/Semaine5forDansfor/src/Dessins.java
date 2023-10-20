public class Dessins {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int choix;
		do{
			afficherMenu();
			System.out.print("\nEntrez votre choix : ");
			choix=scanner.nextInt();
			switch(choix){
				case 1: carre();
					break;
				case 2: triangleVersion1();
					break;
				case 3: triangleVersion2();
					break;
				case 4: triangleVersion3();
					break;
				//case 5: pyramide();
					//break;

				// A COMPLETER
			}
			System.out.println();
		}
		while(choix>=1 && choix<=2);
	}

	private static void afficherMenu(){
		System.out.println("*********");
		System.out.println("Dessins :");
		System.out.println("*********");
		System.out.println("1 -> carre");
		System.out.println("2 -> triangle version 1");
		System.out.println("3 -> triangle version 2");
		System.out.println("4 -> triangle version 3");
		System.out.println("5 -> pyramide");
		System.out.println("6 -> losange");
	}

	// Création du carré
	private static void carre() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();

		for (int i = 1; i <= n ; i++) {

			for (int j = 1; j <= n ; j++) {

				System.out.print("X");
			}

			System.out.println();
		}
	}

	// Création du triangle V1
	private static void triangleVersion1() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();

		for (int i = 1; i <= n ; i++) {

			for (int j = n - i + 1 ; j <= n ; j++) {

				System.out.print("X");
			}
			System.out.println();
		}
	}

	// Création du triangle V2
	private static void triangleVersion2() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();

		for (int i = 1; i <= n ; i++) {

			for (int j = i ; j <= n ; j++) {

				System.out.print("X");
			}
			System.out.println();
		}
	}

	// Création du triangle V3 (pas optimal)
	private static void triangleVersion3() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		String space = " ";
		boolean thereIsSpace = false;

		for (int i = 1; i <= n ; i++) {

			for (int j = i ; j <= n ; j++) {

				if(thereIsSpace)
					System.out.print("X");
					else{
						System.out.print(space.repeat (i - 1));
						thereIsSpace = true;
						System.out.print("X");
					}
			}
			System.out.println();
			thereIsSpace = false;
		}
	}

	// Création de la pyramide
	private static void pyramide() {
		System.out.print("\nEntrez n : ");
		int n=scanner.nextInt();
		int nCroix = 1;
		int nEspace = n - 1;

		for (int i = 0; i <= n; i++) {
			
		}

	}
}
