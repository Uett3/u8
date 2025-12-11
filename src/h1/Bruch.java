package h1;

public class Bruch {
    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;

    }



    private int ggT(int x, int y){


        boolean negBruch = false;
        if (x < 0){
            x = x * -1;
            y = y * -1;


        }
        if (y < 0){
            y = y * -1;


        }

        // Ist halt so die Frage was passieren soll, wenn der Bruch Negativ ist???

        int a = x;
        int b = y;

        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }


        if(a == 1){
            return 1;
        }
        if(b == 1){
            return 1;
        }

        int[] teilerA = new int[a];
        int counterA = 0;

        for (int i = 1; i < a + 1; i++){

            if(a%i == 0){
                teilerA[counterA] = i;
                counterA++;
                //System.out.println(i);
            }
        }

        int[] teilerB = new int[b];
        int counterB = 0;

        for (int i = 1; i < b + 1; i++){

            if(b%i == 0){
                teilerB[counterB] = i;
                counterB++;
                //System.out.println(i);
            }
        }
       // System.out.println("Counter a ist " + counterA);
        for (int i = counterA-1; i > 0; i --){
            //System.out.println(i);
            for (int j = counterB-1; j > 0; j --){
                if (teilerA[i] == teilerB[j]){
                    //System.out.println("teiler ist" + teilerA[i]);
                    return teilerA[i];
                }

            }

        }
        return 1;
    }

    public void shorten(){

        if (nenner == 0){
            zaehler = 1;
            nenner = 0;
            return;

        }

        int ggt = ggT(zaehler,nenner);
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;

        if(zaehler < 0 && nenner < 0){
            zaehler *= -1;
            nenner *= -1;
        }
    }

    public boolean hasSameValueAs(Bruch b){
        shorten();
        b.shorten();

        if(zaehler == b.zaehler && nenner == b.nenner){
            return true;
        }
        return false;


    }
}