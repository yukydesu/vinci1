public class Article {
    private String reference, nom, description;
    private double prixHorsTVA, tauxTVA;
    public Article(String reference, String nom, String description ,double prixHorsTVA, double tauxTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
    this.prixHorsTVA = prixHorsTVA;
        this.tauxTVA = tauxTVA;
    }
    public Article(String reference, String nom, String description ,double prixHorsTVA) {
        this(reference, nom, description, prixHorsTVA, 21);
    }

    public String getReference() {return reference;}
    public String getNom() {return  nom;}
    public String getDescription() {return description;}
    public double getPrixHorsTVA() {return prixHorsTVA;}
    public double getTauxTVA() {return tauxTVA;}
    public void setDescription(String description) {this.description = description;}
    public void setPrixHorsTVA(double prixHorsTVA) {this.prixHorsTVA = prixHorsTVA;}
    public void setTauxTVA(double tauxTVA) {this.tauxTVA = tauxTVA;}

    public String toString() {return "Nom : " + nom + " / Référence : " + reference;}

    public double calculerPrixTVAComprise() {return (prixHorsTVA * (1 + tauxTVA/100));}
    public double calculerPrixTVAComprise(double reduction) {return ((prixHorsTVA * (1 - reduction/100)) * (1 + tauxTVA/100));}

}


