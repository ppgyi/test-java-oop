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

        // Ku spred operatoru
        vypis("text", 4,5,67,876,4,2,90);

        // Nerovnomerne 2D polia
        int[][] pole = new int[10][];
        for(int i = 0; i<pole.length; i++){
            pole[i] = new int[i+1];
            for(int j = 0; j<pole[i].length; j++){
                pole[i][j] = j;
            }
        }
        for (int i = 0; i<pole.length; i++){
            System.out.println(Arrays.toString(pole[i]));
        }

        // Objekty - triedy
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.one = 1;
        bmw.one = 2;

        if(skoda.one == bmw.one){
            System.out.println("rovnake");
        } else {
            System.out.println("rozne");
        }

//        skoda.stavNadrze = 100; --- Ak by bolo public
        skoda.setStavNadrze(100); // Teraz je private
        skoda.drive(100);
//        System.out.println(skoda.stavNadrze); --- To iste, ak by bolo public
        System.out.println(skoda.getStavNadrze()); // getter pri private


        // ==== Nova trieda  ======
        Contact contact = new Contact("Peter", "Palagyi");
        // Tu mozeme pouzit aj var variables - v triedach sa to neda pouzit:
        var contact2 = new Contact("Martin", "Klingac");
        var contact3 = new Contact("Jana Kratka");
        var contact4 = Contact.parseFromFullName("Ivan Kral");

        var contacts = new Contact[] {contact2, contact3, contact4};
        contact.setFriends(contacts);
        // alebo
        contact.setFriends(contact4, contact3, contact2);

        // === DEDENIE ===
        var student = new Contact("Andrej Novy");
        var absolvent = new Graduate("Tomas", "Stary", "Bc.");

        // Dcera vie pouzivat atributy ale aj metody matky,
        // popripade override (prepise, pretazi) metody matky.
        System.out.println(student.akoText());
        System.out.println(absolvent.akoText());
    }

    public static int scitaj(int a, int b) {
        return a+b;
    }

    // Pouzitie spred operatora to je ... (berie sa to ako pole)
    public static void vypis(String text, int... pole){
        System.out.println(text);
        System.out.println(Arrays.toString(pole));
//        Vypise:
//        text
//        [4, 5, 67, 876, 4, 2, 90]
    }
}
