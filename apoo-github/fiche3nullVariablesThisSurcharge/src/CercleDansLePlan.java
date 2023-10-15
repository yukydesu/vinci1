
public class CercleDansLePlan {
	private double rayon;
	private Point centre;
	
	public CercleDansLePlan(double rayon, Point centre) {
		this.rayon = rayon;
		this.centre = centre;
		// Prrendre ce qu'il y a a droite et le mettre dans a gauche
	}
	public CercleDansLePlan(Point centre){
		this(1, centre);
	}

	public CercleDansLePlan() {
		this(1,new Point(0,0));
	}
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double nRayon) {
		rayon = nRayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point nCentre) {
		centre = nCentre;
	}
	
	public String toString() {
		return "Cercle de rayon : " + rayon + " de centre " + centre;
	}
	

}
