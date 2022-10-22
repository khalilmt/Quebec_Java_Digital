package exercicio.metodos;
// execicio de sobrecarga
public class Quadrilateros {

    public static void area(double lado) {

        System.out.println("Area do quadrado é =" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Area do retangulo é =" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do trapezio é =" + ((baseMaior + baseMenor)*altura) /2);
    }

}
