package desafio4;

/**
 * Desafio 4 - Remova todos os valores ímpares:
   Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        
        System.out.println(pares);
    }

}
