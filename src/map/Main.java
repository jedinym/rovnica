package map;

public class Main
{
    public static void main(String[] args)
    {
//        Linearna l = new Linearna();
//        l.vypisRovnicu();
//
//        l.vypisKorene();
//
//        System.out.println(l.toString());

//        Kvadraticka k = new Kvadraticka(1,-5,6);

//        k.vypisKorene();


        Rovnica[] rovnice = new Rovnica[4];

        rovnice[0] = new Linearna(3,4);
        rovnice[1] = new Kvadraticka(4,10, 8);
        rovnice[2] = new Linearna(5,19);
        rovnice[3] = new Kvadraticka(1,-5, 6);

        for (Rovnica r : rovnice)
        {
            r.vypisRovnicu();
            r.vypisKorene();

        }
    }
}
