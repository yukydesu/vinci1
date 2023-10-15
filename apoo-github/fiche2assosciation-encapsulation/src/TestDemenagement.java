
public class TestDemenagement {
	public static void main(String[] args) {
		Date dateBrad = new Date(1963,12,18);
		Date dateAngelina = new Date(1975,6,4);
		Adresse adresse = new Adresse("Rue des stars", "52","1000","Bruxelles");
		Personne brad = new Personne("Pitt","Brad",dateBrad,adresse);
		Personne angelina = new Personne("Jolie", "Angelina",dateAngelina, adresse);
		brad.demenager("Rue des �toiles", "32", "1000", "Bruxelles");
		angelina.demenager("Rue des �toiles", "32", "1000", "Bruxelles");

		System.out.println(brad);
		System.out.println(angelina);
	}
}
