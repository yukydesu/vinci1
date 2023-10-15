public class CoteCommentee {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Note : ");
        double note = scanner.nextDouble();
        String commentee = "";
        if(note < 10)
            commentee = "l’étudiant n’a pas validé l’UE";
        else{
            if(note < 14)
                commentee = "l’étudiant a validé l’UE";
            else{
                if(note < 16)
                    commentee = "l’étudiant a validé l’UE avec une belle cote";
                else{
                    commentee = "l’étudiant a validé l’UE avec une très belle cote";
                    }
                }
            }
        System.out.println(commentee);
    }
}
