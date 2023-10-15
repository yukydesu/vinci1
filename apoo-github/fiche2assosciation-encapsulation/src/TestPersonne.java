public class TestPersonne {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("rue de la gare", "34", "5000", "Namur");
        Date date1 = new Date(2002, 4, 3);
        Personne personne1 = new Personne("Shmit", "Paul", date1, adresse1);

        System.out.println(personne1);
    }
}