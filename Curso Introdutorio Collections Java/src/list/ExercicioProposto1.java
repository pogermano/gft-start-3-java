package list;

import java.util.*;

public class ExercicioProposto1 {

    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
      //  List<Double> notas = new ArrayList<>();
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        Iterator<Double> iterator = notas.iterator();
        Double soma =  0d;
        while (iterator.hasNext()){
           // iterator.next(); ctrl+alt v cria a variavel next abaixo
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

    }
}
