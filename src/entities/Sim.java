package entities;

import java.util.Arrays;

public class Sim {

    //    attributi
    private long numTel;
    private double credito;
    private String[] chiamate;


    //    costruttore
    public Sim(long num) {
        this.numTel = num;
        this.credito = 0.0;
        this.chiamate = new String[5];
    }


    //    metodi
    public void stampaSim() {
        System.out.println("Il tuo numero è il seguente: " + numTel);
        System.out.println("Hai un credito di: " + credito + "€");
        System.out.println(Arrays.toString(chiamate));
    }


}
