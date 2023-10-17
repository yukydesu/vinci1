public class Serie {

    // Déclaration des variables privées
    private char nom;
    private Etudiant delegue;

    // Constructeur s'il y a un délégué
    public Serie(char nom, Etudiant delegue) {
        this.nom = nom;
        this.delegue = delegue;
    }

    // Constructeur s'il y en a pas
    public Serie(char nom) {
        this(nom, null);
    }

    // Getter
    public char getNom() {return nom;}
    public Etudiant getDelegue() {return delegue;}

    // Permet d'élire un délégué pour une série
    public boolean elireDelegue(Etudiant delegue) {

        // Si la série n'a pas de délégue et que l'étudiant est dans cette série.
        if (this.delegue == null && delegue.getSerie().getNom() == nom ) {
            this.delegue = delegue;
            this.delegue.setEstDelegue(true);
            return true;

        // Si non
        }else{return false;}
    }

    // Affichage de la classe
    public String toString() {
            if(delegue == null)
                return "Série " + nom;
            else{return "Série " + nom + " (délégué : " + delegue.getPrenom() + " " + delegue.getNom() + ")";}
        }
}
