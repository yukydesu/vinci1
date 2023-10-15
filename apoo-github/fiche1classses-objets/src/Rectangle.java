// Exrecice 3.1
class Rectangle {

    double longueur;
    double largeur;

    // Constructeur :
    Rectangle(double nLongueur, double nLargeur) {
        // Attributs :
        longueur = nLongueur;
        largeur = nLargeur;
    }

    // Méthodes :
    double calculerAire() {
        return longueur * largeur;
    }

    double calculerPerimetre() {
        return (longueur + largeur) * 2;
    }
}
