public class Point {
    private double x, y;
    public Point(double nX, double nY) {
        x = nX;
        y = nY;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(int nnX) {x = nnX;}
    public void setY(int nnY) {y = nnY;}
    public String toString() {return "(" + x + "," + y + ")";}
}