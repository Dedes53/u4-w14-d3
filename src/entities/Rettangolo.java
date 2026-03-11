package entities;

public class Rettangolo {

    //    attributi
    private double base;
    private double altezza;
    private double perimetro;
    private double area;


    //    costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    //    metodi statici
    public static String stampaRettangolo(Rettangolo rettangolo) {

        return "Questo rettangolo ha perimetro " + rettangolo.perimetro() + " cm, ed area: " + rettangolo.area() + " cm2.";
    }

    public static String stampa2Rettangoli(Rettangolo A, Rettangolo B) {
        double pA = A.perimetro();
        double pB = B.perimetro();

        double aA = A.area();
        double aB = B.area();

        return "Il primo rettangolo ha perimetro: " + pA + " cm, ed area: " + aA + " cm2." +
                "\nIl secondo rettangolo ha perimetro: " + pB + " cm, ed area: " + aB + " cm2." +
                "\nIl totale dei perimetri è: " + pA + pB + " cm, mentre il totale delle aree è: " + aA + aB + " cm2.";
    }


    //    metodi
    public Double perimetro() {
        this.perimetro = (this.altezza + this.base) * 2;
        return this.perimetro;
    }

    public double area() {
        this.area = this.altezza * this.base;
        return this.area;
    }


}
