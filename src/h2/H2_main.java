package h2;

import java.util.ArrayList;

public class H2_main {
    public static void main(String[] args) {


        SimpleList MYSy = new SimpleList();
        System.out.println(MYSy.getLast());

        MYSy.append(1);
        MYSy.printAll();
        MYSy.insertAfter(1,3);
        MYSy.delete(1);
        MYSy.delete(3);
        MYSy.delete(Integer.MIN_VALUE);
        MYSy.printAll();
        /*
        MYSy.append(2);
        MYSy.append(4);

        MYSy.append(1111);

        System.out.println(MYSy.getLast().value);
        System.out.println(MYSy.delete(Integer.MIN_VALUE));
        System.out.println(MYSy.findFirst(6666));





        MYSy.delete(1111);
        //MYSy.delete(1111);
        MYSy.printAll();


         */




    }
}
