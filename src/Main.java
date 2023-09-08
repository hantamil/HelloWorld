public class Main {

    public static void main(String[] args) {

        // datatyper
        int a= 5;
        // int plejer at være mere end tilstrækkeligt

        long a1 = 6;
        // long fylder meget, mere end int, skal kun bruges hvis nødvendigt

        short a2 = 7;
        // short fylder mindre end int

        double d = 3.4;
        // når decimaler

        float d1 = 3.5f;
        // hvis float skal der f efter defineret værdi

        // System.out.println("d: " + d);

        char c = 'y';
        // gåseøjne ved string fx system.out.println, ellers '' (1 variabel)

        boolean valid = true;

        System.out.println("a: " + a + " " + "d: " + d + " " + "c: " + c);


        // objekt datatype (klasse defineret i javas api)
        // char c = 'yes'; virker ikke, da der er for mange karaktere
        String s = "yes";

        int t1 = 6;
        int t2 = 8;
        int t3;
        // t3 er bare en erklæring

        t3 = t1/t2;

        System.out.println(t3);

        t3 = t1%t2;
        System.out.println(t3);

        int t4 = 1;
        t4 = t4 + 1;
         // det samme som nedenstående (samme med minus) ++ eller -- lægger 1 til eller trækker 1 fra
        t4++; // ++t4

        t4 = t4;

        t4 = t4 - 1;

        t4--; // --t4
    }

}
