public class Etudiant {

    // Déclaration des variables privées
    private String nom, prenom, matricule;
    private Serie serie;
    private boolean estDelegue;

    // Constructeur
    public Etudiant(String matricule, String nom, String prenom, Serie serie) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.serie = serie;
    }

    // Getter
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getMatricule() {return matricule;}
    public Serie getSerie() {return serie;}
    public boolean getEstDelegue() {return estDelegue;}

    // Setter
    public void setEstDelegue(boolean oui) {
        estDelegue = true;
    }

    // Permet de changer la série d'un étudiant
    public boolean changerSerie(Serie serie) {

        // S'il est dans un autre série et qu'il n'est pas délégué
        if(this.serie != serie && ! estDelegue) {

            this.serie = serie;
            return true;

        // Si non
        }else{return false;}
    }

    // Affichage de la classe
    public String toString() {
        return (matricule + ", " + nom + " " + prenom + " (série " + serie.getNom() + ")");
    }

}
