public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 7;
        if(nota >= 7)
            System.out.println("Voce esta aprovado!");

        else if(nota >= 5 && nota < 7)
            System.out.println("Você esta de recuperação!");

        else System.out.println("Voce esta reprovado!");
    }
}
