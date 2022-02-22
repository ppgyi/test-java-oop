package sk.pgyi.oop;

import java.util.Arrays;
import java.util.Objects;

public class App {
    public static void main(String[] args){
        System.out.println("Ahooj svet");
        System.out.println("5 + 6 je " + scitaj(5,6));

//        primitivne datove typy

        int celeCislo = 3;
        long celeCisloVacsie = 5L;
        float desatinneCisloSinglePrecision = 5.5f;
        double desatinneCisloDoublePrecision = 5.5;
        char znak = 'a';
        boolean pravdaNepravda = true; // false

//        objekt - OOP

        String retazec = "a";

//        plus minus ... funguju normalne, ale len rovnake typy

        int podiel = 2/3; // 0
        int poDeleni = 2%3; // 2
        float podielDesatiny = 2/3.0f; // 0.6666667

//        podmienky

        if(celeCislo == 4){
            System.out.println("Nieco");
        } else if(celeCislo == 5){
            System.out.println("Trala");
        } else {
            System.out.println("End");
        }

        switch (celeCislo) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
            case 4:
                System.out.println("je to 3 alebo 4");
                break;
            default:
                System.out.println("je to: " + celeCislo );
//                alebo radsej takto:
                System.out.println(String.format("je to: %d", celeCislo));
        }

        for (int i=0; i<6; i++){
            System.out.println(i);
        }

        int a = 0;
        while(a<6){
            System.out.println("fake for a = " + a);
            a++;
        }

        System.out.println(); // Prazdny riadok
//        prazdny riadok: "\n"

        int b = 0;
        do {
            b++;
            System.out.println("fake for b = " + b);
        } while (b<6);

//        POLIA
        System.out.println();

        int[] mojePole = new int[10];

        for(int i = 0; i < mojePole.length; i++){
            if (i == 0){
                mojePole[i] = 1;
                continue;
            }

            mojePole[i] = mojePole[i - 1] * 2;
        }

        for(int i = 0; i < mojePole.length; i++){
            System.out.println(i + " : " + mojePole[i]);
        }

//        Porovnavanie
        System.out.println();

        int x = 5;
        int y = 5;
        System.out.println(x == y);

        System.out.println();

        String s = "a";
        // Toto je importovana class z netu na zadanie textu do consoly
        String d = KeyboardInput.readString("Zadajte text");
        System.out.println(s == d); // Nespravny postup porovnania objektov
        System.out.println(s.equals(d)); // Spravne
        System.out.println(Objects.equals(s, d)); // Spravne

        // Porovnanie ARRAYS
        System.out.println();

        int[] f = new int[]{1,2,3};
        int[] g = new int[3];
        for(int i = 0; i<g.length; i++){
            g[i] = i + 1;
        }
        System.out.println(Arrays.equals(f,g));
    }

    public static int scitaj(int a, int b) {
        return a+b;
    }
}
