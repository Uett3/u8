package h1;


public class H1_main {
    public static void main(String[] args) {
        Bruch bruch = new Bruch(0,0);
        Bruch bruchee = new Bruch(0,8);
        System.out.println(bruch.zaehler);
        System.out.println(bruch.nenner);
        bruch.shorten();
        System.out.println(bruch.zaehler);
        System.out.println(bruch.nenner);

        System.out.println(bruch.hasSameValueAs(bruchee));


    }
}
