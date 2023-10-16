public class CombatAMortSansBreak {

    public static void main(String[] args) {

        System.out.println("Bienvenue au combat entre CogneDur et FrappeFort !\n");
        int pointsDeVieCogneDur = 9;
        int pointsDeVieFrappeFort = 12;
        int tour = 0;

        while (pointsDeVieCogneDur > 0 && pointsDeVieFrappeFort > 0) {

            int de = lancerDe();
            if((tour % 2) == 0) {

                pointsDeVieFrappeFort -= de;
                System.out.println("CogneDur inflige " + de + " points de degats a FrappeFort.");

                if (pointsDeVieFrappeFort <= 0) {
                    System.out.println("FrappeFort est mort. Paix a son ame, il est mort en brave.");
                    System.out.println("CogneDur est victorieux.");

                } else {
                    System.out.println("Il reste " + pointsDeVieFrappeFort + " points de vie a FrappeFort.\n");
                }

            }else{

                pointsDeVieCogneDur -= de;
                System.out.println("FrappeFort inflige " + de + " points de degats a CogneDur.");

                if (pointsDeVieCogneDur <= 0) {
                    System.out.println("CogneDur est mort. Paix a son ame, il est mort en brave.");
                    System.out.println("FrappeFort est victorieux.");
                } else {
                    System.out.println("Il reste " + pointsDeVieCogneDur + " points de vie a CogneDur.\n");
                }
            }
         tour ++;

        }
    }

    public static int lancerDe(){
        return (int)((Math.random() * 6) + 1);
    }
}
