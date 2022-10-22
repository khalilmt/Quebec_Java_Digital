public class CaixaEletronico {
    public static void main(String[] arg) {

        double saldo = 25.00;
        double valorSolicitado = 25.00;

        if(valorSolicitado <= saldo)
            saldo = saldo - valorSolicitado;
        System.out.println("Seu saldo atual é: " + saldo);
    }
}
