import entities.Rettangolo;

public class Main {
    static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3.7, 2.5);
        Rettangolo rettangolo2 = new Rettangolo(6.9, 4.4);

        System.out.println(rettangolo.perimetro());
        System.out.println(rettangolo2.perimetro());
        System.out.println(rettangolo.area());
        System.out.println(rettangolo2.area());
    }
}