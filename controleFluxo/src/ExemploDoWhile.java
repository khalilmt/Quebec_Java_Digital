import java.util.Random;

public class ExemploDoWhile {
    public static void main (String[] args) {

        System.out.println ("Discnando...");

        do {

            System.out.println("Telefone tocando");

        }while (tocando());

        System.out.println("Alô!!");
    }

    private static boolean tocando () {

        boolean atendeu = new Random() . nextInt(5) == 1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}
