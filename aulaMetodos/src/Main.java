import exercicio.metodos.Calculadora;
import exercicio.metodos.Emprestimo;
import exercicio.metodos.Mensagem;
import exercicio.metodos.Quadrilateros;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicios Metodos Java");

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(10, 2);
        Calculadora.subtracao(10, 2);
        Calculadora.multiplicacao(10, 2);
        Calculadora.divisao(10,2);

        //Mensagem
        System.out.println("Exercicio Mensagem Conforme Hora Do Dia");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(0);

        //Emprestimo
        System.out.println("Exercicio Calculo de Emprestimo.");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Quadrilateros
        System.out.println("Exercicio de sobrecarga");
        Quadrilateros.area(3);
        Quadrilateros.area(5, 5);
        Quadrilateros.area(7,8,9);
    }
}