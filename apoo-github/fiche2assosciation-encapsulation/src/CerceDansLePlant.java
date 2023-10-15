public class CerceDansLePlant {
    private double rayon;
    private Point centre;
    public CerceDansLePlant(double nRayon, Point nCentre) {
        rayon = nRayon;
        centre = nCentre;
    }
    public double getRayon() {return rayon;}
    public Point getCentre() {return centre;}

    public void setRayon(double nRayon) {rayon = nRayon;}
    public void setCentre(double nX,double nY) {
        centre = new Point(nX, nY);}

    public String toString() {return "rayon : " + rayon +
            " | coordonnées du centre : " + centre;}
}
