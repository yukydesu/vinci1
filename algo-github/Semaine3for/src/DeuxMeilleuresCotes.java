public class DeuxMeilleuresCotes {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double noteMax = 0;
        double noteMax2 = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print("note " + i + " : ");
            double note = scanner.nextDouble();
            if(note == noteMax)
                noteMax2 = note;
            if(note > noteMax) {
                noteMax2 = noteMax;
                noteMax = note;
            }else{
                if((note >= noteMax2) && (note < noteMax))
                    noteMax2 = note;}
        }
        System.out.println("Ses deux meilleures notes sont : " + noteMax + " et " + noteMax2);
    }
}
