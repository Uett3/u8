package h2;

public class H2_main {
    public static void main(String[] args) {
        int a = -5;
        int b = -3;

        int c = a %b;
        System.out.println(c);

        SimpleList MYSy = new SimpleList();
        MYSy.append(3);
        MYSy.append(2);
        MYSy.append(44);
        MYSy.delete(44);
        System.out.println(MYSy.getLast().value);


    }
}
