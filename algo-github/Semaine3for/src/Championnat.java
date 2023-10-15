public class Championnat {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int noteTotal = 0;
        int noteMinimal = 20;
        int noteMaximal = 0;
        double noteMoyenne = 0;
        for (int i = 1; i <=8 ; i++) {
            System.out.print("Note du jury " + i + " : ");
            int note = scanner.nextInt();
            noteTotal += note;
            if(note <= noteMinimal)
                noteMinimal = note;
            if(note >= noteMaximal)
                noteMaximal = note;
        }
        noteMoyenne = Math.round((noteTotal - (noteMaximal + noteMinimal)) / 6);
        if(noteMoyenne >= 8)
            System.out.println("Vous passez en final avec une note moyenne de : " + noteMoyenne);
        else{
            System.out.println("Vous ne passez pas en final avec une note moyenne de : " + noteMoyenne);
        }
    }
}
