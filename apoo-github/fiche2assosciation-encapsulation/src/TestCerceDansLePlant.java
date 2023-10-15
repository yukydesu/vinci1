public class TestCerceDansLePlant {
    public static void main(String[] args) {
        Point centre1 = new Point(4, 2.5);
        CerceDansLePlant cercle1 = new CerceDansLePlant(4, centre1);
        CerceDansLePlant cercle2 = new CerceDansLePlant(12.5, centre1);

        System.out.println("c1 : " + cercle1);
        System.out.println("c2 : " + cercle2);

        cercle2.getCentre().setX(5);

        System.out.println("c1 : " + cercle1);
        System.out.println("c2 : " + cercle2);
    }
}
