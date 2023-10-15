public class CompteEnBanque {

    private Personne titulaire;
    private Date dateValideCarteIdd;
    private String numeroCompte;
    private Date getDateOuverture;
    private double solde;

    CompteEnBanque(Personne nTitulaire, Date nDateValideCarteIdd, String nNumeroCompte,
                   Date nDateOuverture, double nSolde) {
        titulaire = nTitulaire;
        dateValideCarteIdd = nDateValideCarteIdd;
        numeroCompte = nNumeroCompte;
        getDateOuverture = nDateOuverture;
        solde = nSolde;}
    public Personne getTitulaire() {return titulaire;}
    public Date getDateValideCarteIdd() {return dateValideCarteIdd;}
    public String getNumeroCompte() {return numeroCompte;}
    public Date getGetDateOuverture() {return getDateOuverture;}
    public double getSolde() {return solde;}
    public void setDateValideCarteIddr(int nAnnee, int nMois, int nJour) {
        dateValideCarteIdd = new Date(nAnnee, nMois, nJour);}
    // TRAITER D'ABORD LES CAS D'ERREUR !!!!!
    public boolean retirer(double nRetrait) {
        if((nRetrait <= 0) || (nRetrait > solde))
            return false;
        solde -= nRetrait;
        return true;}
    // TRAITER D'ABORD LES CAS D'ERREUR !!!!!
    public boolean deposer(double nDepot) {
        if(nDepot <= 0)
            return false;
        solde += nDepot;
        return true;}
    // METTRE VERBE DANS UNE OPERATION
    public boolean faireVirement(double nVirement, CompteEnBanque nDestinataire) {
        if((nVirement <= 0) || (nVirement> solde))
            return false;
        solde -= nVirement;
        nDestinataire.solde += nVirement;
        return true;}
    public String toString() {return titulaire.getNom() + " " + titulaire.getPrenom() +
            " " + numeroCompte + " " + getDateOuverture + " SOLDE : " + solde + "€";}
}
