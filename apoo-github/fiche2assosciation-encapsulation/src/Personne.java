public class Personne {

    private String nom, prenom;
    private Adresse domicile;
    private Date dateDeNaissance;
    public Personne(String nNom, String nPrenom, Date nDateDeNaissance, Adresse nDomicile) {
        nom = nNom;
        prenom = nPrenom;
        dateDeNaissance = nDateDeNaissance;
        domicile = nDomicile;
    }
    public String getPrenom() {return prenom;}

    public String getNom() {return nom;}
    public int calculerAge() {return 2023 - dateDeNaissance.getAnnee();}
    public int calculerAgeEn(int annee) {return annee - dateDeNaissance.getAnnee();}
    public Date getDateDeNaissance() {return dateDeNaissance;}
    public Adresse getDomicile() {return domicile;}
    public void demenager(String nRue, String nNumero, String nCodePostal, String nVille) {
        domicile = new Adresse(nRue, nNumero, nCodePostal, nVille);}
    public String toString() {return nom + " " + prenom + " né le "
            + dateDeNaissance + " habitte " + domicile ;}
}
