package sk.pgyi.oop;

public class Auto {
    public int pocetKolies;
    public int pocetDvery;
    public double kapacitaNadrze;
    public double stavNadrze;
    public String nazov;

    private static final double FUEL_PER_KM = 0.5;

    // Ukazka moznosti podla stupna verejnosti, od public po private
    public int one; // viem sa dostat stale
    int two; // neviem sa dostat pokial je class v inom package
    protected int three; //nieco s dedenim
    private int four; // neviem sa dostat

    public void drive(double distanceInKm) {
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze<0){
            stavNadrze=0;
        }
    }
}
