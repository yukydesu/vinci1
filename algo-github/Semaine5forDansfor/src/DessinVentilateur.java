public class DessinVentilateur {

    // Importation de Tortue
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        // Tortue sous dopamine
        tortue.accelerer();

        // Nombre de carrés que je veux et avec quel degré d'écart
        for (int i = 1; i <= 3 ; i++) {

            // Création d'un carré
            for (int j = 1; j <= 4 ; j++) {

                tortue.avancer(100);
                tortue.tournerADroite(90);
            }

        // Degré d'écart
        tortue.tournerADroite(120);
        }
    }
}
