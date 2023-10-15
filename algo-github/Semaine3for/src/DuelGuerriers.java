public class DuelGuerriers {

	public static void main(String[] args) {

		int pointsDeVieCogneDur = lancerDe();
		System.out.println("CogneDur a "+pointsDeVieCogneDur+" points de vie.");
		int pointsDeVieFrappeFort = lancerDe();
		System.out.println("FrappeFort a " + pointsDeVieFrappeFort + " points de vie.");
		int attaqueCogneDur = lancerDe();
		int attaqueFrappeFort = lancerDe();

		System.out.println("CogneDur inflige " + attaqueCogneDur + " de dégats à FrappeFort");

		if(attaqueCogneDur < pointsDeVieFrappeFort) {
			pointsDeVieFrappeFort -= attaqueCogneDur;
			System.out.println("FrappeFort a " + pointsDeVieFrappeFort + " points de vie");
			System.out.println("FrappeFort inflige " + attaqueFrappeFort + " de dégats à CogneDur");
			if(attaqueFrappeFort < pointsDeVieCogneDur) {
				pointsDeVieCogneDur -= attaqueFrappeFort;
				System.out.println("CogneDur a " + pointsDeVieCogneDur + " points de vie");
				if(pointsDeVieFrappeFort > pointsDeVieCogneDur)
					System.out.println("FrappeFort gagne une coupe en or et CogneDur gagne une coupe en argent");
				else if(pointsDeVieFrappeFort == pointsDeVieCogneDur)
					System.out.println("CogneDur et FrappeFort gagne une coupe en or.");
					else{
					System.out.println("CogneDur gagne une coupe en or et FrappeFort gagne une coupe en argent");}
			}else{
				System.out.println("CogneDur est mort. Paix à son âme, il est mort en brave.");
				System.out.println("FrappeFort remporte une coupe en or.");}
		}else{
			System.out.println("FrappeFort est mort. Paix à son âme, il est mort en brave.");
			System.out.println("CogneDur remporte une coupe en or.");}
	}


	public static int lancerDe(){
		return (int)((Math.random() * 6) + 1);
	}
}
