public class DessinCarresEmboites {

    // Importation de Tortue
    public static Tortue tortue = new Tortue();

    public static void main(String[] args) {

        // Tortue sous dopamine
        tortue.accelerer();

        // Nombre de carrés
        for (int i = 0; i < 6 ; i++) {

            // Chaque nouveau carré sera plus petit que son précédent ("10" == à quel point il rétrécit)
            for (int j = 1; j <= 4 ; j++) {

                tortue.avancer(100 - i * 10);
                tortue.tournerADroite(90);
            }
        }
    }
}
