public class TestCompteEnBanque {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("rue de la gare", "34", "5000", "Namur");
        Date dateNaissance1 = new Date(2002, 4, 3);
        Personne personne1 = new Personne("Leconte", "Paul", dateNaissance1, adresse1);
        Personne personne2 = new Personne("Marbela", "Sativa", dateNaissance1, adresse1);
        Date dateDeValiditeCompte1 = new Date(2030, 7, 2);
        Date dateOuvertureCompte1 = new Date(2010, 1, 1);

        CompteEnBanque compte1 = new CompteEnBanque(personne1, dateDeValiditeCompte1,
                "000-000000089-89", dateOuvertureCompte1, 1200);
        CompteEnBanque compte2 = new CompteEnBanque(personne2, dateDeValiditeCompte1, "12345678910",
                dateOuvertureCompte1, 3000);

        System.out.println(compte1);
        System.out.println(compte2);
        compte1.deposer(100);
        System.out.println(compte1);
        compte1.faireVirement(100, compte2);
        System.out.println(compte1);
        System.out.println(compte2);

    }
}
