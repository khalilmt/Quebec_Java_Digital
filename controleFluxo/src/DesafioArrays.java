public class DesafioArrays {

    public static void main(String[] args) {
        int[] vetor = {2, 3, 5, 7, 11, 13, 18, 34};

        for (int par : vetor){

            if (par %2 == 0) {
                System.out.println("Numero par: " + par);
            }
        }

    }
}