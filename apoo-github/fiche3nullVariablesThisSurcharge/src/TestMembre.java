public class TestMembre {
    public static void main(String[] args) {

        Membre membre1 = new Membre("Emmeline" ,"Lecont", "0456546920");
        Membre membre2 = new Membre("Yopo", "Yapa", "0475834950");
        Membre membre3 = new Membre("Paka", "Kata", "0456849358", membre2);
        Membre membre4 = new Membre("Pascale", "Robert", "0489020099");
        membre4.initParrain(membre3);


        membre1.initParrain(membre2);
        System.out.println(membre1.tostring());
        System.out.println(membre3.tostring());
        System.out.println(membre4.tostring());
    }

}
