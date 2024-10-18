package desafio9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
   Com a Stream API, verifique se todos os números da lista são distintos (não se repetem)
   e exiba o resultado no console.
 */

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        boolean allDistinct = numeros.stream()
                .allMatch(new HashSet<>()::add);
        
        System.out.println("Todos os números são distintos? " + allDistinct);
    }

}
