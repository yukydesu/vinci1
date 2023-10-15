public class Date {
    private int annee, mois, jour;
    public Date(int nAnne, int nMois, int nJour) {
        annee = nAnne;
        mois = nMois;
        jour = nJour;
    }
    public int getJour() {return jour;}
    public int getMois() {return mois;}
    public int getAnnee() {return annee;}

    public String toString() {return getJour() + "/" + getMois() + "/" + getAnnee();}
}
