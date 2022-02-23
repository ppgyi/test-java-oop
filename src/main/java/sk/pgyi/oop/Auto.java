package sk.pgyi.oop;

public class Auto {
    public int pocetKolies;
    public int pocetDvery;
    private double kapacitaNadrze;
    private double stavNadrze;
    public String nazov;
    private boolean neojazdene; // Defaultna hodnota je false

    private static final double FUEL_PER_KM = 0.5;

    // Ukazka moznosti podla stupna verejnosti, od public po private

    public int one; // viem sa dostat stale
    int two; // neviem sa dostat pokial je class v inom package
    protected int three; //nieco s dedenim
    private int four; // neviem sa dostat

    // Konstruktor vytvara instancie a zadava prvotne hodnoty
    public Auto() { // Je to bezparametricky konstruktor, moze byt aj private
        neojazdene = true; // Tu viem zmenit defaulnu hodnotu boolean na true
        kapacitaNadrze = 100;
    }

    public void drive(double distanceInKm) {
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze<0){
            stavNadrze=0;
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    // Namiesto settra mozem urobit nejaku metodu ktora nasetuje stavNadrze:
    public void dotankovat(){
        stavNadrze = kapacitaNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }
}
