public class DuelGuerriers_VI {

    public static void main(String[] args) {

        FenetreCombatGuerriers jeu = new FenetreCombatGuerriers();
        jeu.afficherInformation("A CogneDur");
        int pointsDeVieCogneDur = jeu.lancerDe();
        jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);
        int pointsDeVieFrappeFort = jeu.lancerDe();
        jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);
        int de = jeu.lancerDe();
        jeu.afficherEpee(1);
        if(de >= pointsDeVieFrappeFort) {
            jeu.afficherInformation("CogneDur inflige " + de + " de dégats ! FrappeFort n'a pas survécu... " +
                    "CogneDur remporte la médaille d'or !");
            jeu.afficherCoupeOr(1);
            jeu.afficherCroix(2);
        }else{
            pointsDeVieFrappeFort -= de;
            jeu.afficherInformation("CogneDur inflige " + de + " de dégats ! FrappeFort tient le coup !");
            jeu.afficherPointsDeVie(2, pointsDeVieFrappeFort);
            jeu.afficherBouclier(2);
            de = jeu.lancerDe();
            jeu.afficherEpee(2);
            if(de >= pointsDeVieCogneDur) {
                jeu.afficherInformation("FrappeFort inflige " + de + " de dégats ! CogneDur n'a pas survécu... " +
                        "FrappeFor remporte la médaille d'or !");
                jeu.afficherCoupeOr(2);
                jeu.afficherCroix(1);
            }else{
                pointsDeVieCogneDur -= de;
                jeu.afficherInformation("FrappeFort inflige " + de + " de dégats ! CogneDur tient le coup !");
                jeu.afficherPointsDeVie(1, pointsDeVieCogneDur);
                jeu.afficherBouclier(1);
                jeu.afficherEpee(1);
                if(pointsDeVieCogneDur == pointsDeVieFrappeFort) {
                    jeu.afficherInformation("CagneDur et FrappeFort gagnent une médaille d'or !");
                    jeu.afficherCoupeOr(1);
                    jeu.afficherCoupeOr(2);
                }else{
                    if(pointsDeVieCogneDur > pointsDeVieFrappeFort) {
                        jeu.afficherInformation("CogneDur gagne une médaille d'or et FrappeFort une médaille d'argent !");
                        jeu.afficherCoupeOr(1);
                        jeu.afficherCoupeArgent(2);
                    }else{
                        jeu.afficherInformation("FrappeFort gagne une médaille d'or et CogneDur une médaille d'argent !");
                        jeu.afficherCoupeOr(2);
                        jeu.afficherCoupeArgent(1);
                    }
                }
            }
        }
    }
}
