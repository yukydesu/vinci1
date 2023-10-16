import java.util.Objects;

public class Membre {

    private String nom, prenom, tel;
    private Membre parrain;

    public Membre(String nom, String prenom, String tel, Membre parrain) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.parrain = parrain;
    }

    public Membre(String nom, String prenom, String tel) {
        this(nom, prenom, tel, null);
    }

    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getTel() {return tel;}
    public Membre getParrain() {return parrain;}

    public void setTel(String tel) {this.tel = tel;}

    public boolean initParrain(Membre parrain) {

        if(parrain == null || !((parrain.getNom().equals(nom)) && parrain.getPrenom().equals(prenom))) {
            this.parrain = parrain;
            return true;
        }else{
            return false;}
    }
    public String tostring() {
        if (parrain != null)
            return nom + " " + prenom + " " + tel + " " + parrain.getPrenom() + " " + parrain.getNom() + ".";
        else{
            return nom + " " + prenom + " " + tel + " Le membre n'a pas de parrain";
        }
    }
}
