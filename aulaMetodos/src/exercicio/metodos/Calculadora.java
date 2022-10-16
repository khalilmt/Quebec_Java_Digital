package exercicio.metodos;

public class Calculadora {
    public static void soma(double num1, double num2) {

        double result = num1 + num2;

        System.out.println("A da soma entre: " + num1 + " e " + num2 + " é =" + result);
    }

    public static void subtracao(double num1, double num2) {

        double result = num1 - num2;

        System.out.println("A subtração entre: " + num1 + " e " + num2 + " é =" + result);
    }

    public static void multiplicacao(double num1, double num2) {

        double result = num1 * num2;

        System.out.println("A multiplicação entre: " + num1 + " e " + num2 + " é =" + result);
    }

    public static void divisao(double num1, double num2) {

        double result = num1 / num2;

        System.out.println("A divisao entre: " + num1 + " e " + num2 + " é =" + result);
    }

}
