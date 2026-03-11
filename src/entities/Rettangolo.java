package entities;

public class Rettangolo {

    //    lista attributi
    private double base;
    private double altezza;
    private double perimetro;
    private double area;

    //    costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //    metodi
    public String perimetro() {
        return "perimetro = " + (this.altezza + this.base) * 2 + " cm";
    }

    public String area() {
        return "area = " + this.altezza * this.base + " cm2";
    }

}
