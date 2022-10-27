import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import  java.util.ArrayList;


public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        /*System.out.println("Exiba a posição com a nota 5.0 = " + notas.indexOf(5d));*/

        System.out.println("Adicione a nota 8.0 na posição 4.");
        notas.add(4, 8d);
                System.out.println("Notas = " + notas);

        System.out.println("Substitua a nota 5.0 por 6.0");
        notas.set(notas.indexOf(5d),6d);
                System.out.println("Notas : " + notas);

        System.out.println("Confira se a posição 5 esta na lista! " + notas.contains(5d));

        /*System.out.println("Exiba as notas conforme foram armazenadas : ");
        for (Double nota : notas) System.out.println(nota);*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma do valores: " + soma);

        System.out.println("Exiba a media dos valores: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: " + notas.remove(0));
        System.out.println(notas);

        System.out.println("Remova a nota 0: " + notas.remove(0d));
        System.out.println(notas);

        Iterator<Double> menor7 = notas.iterator();
        while (menor7.hasNext()){

            Double next = menor7.next();
            if(next < 7) menor7.remove();

        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
    }
}
