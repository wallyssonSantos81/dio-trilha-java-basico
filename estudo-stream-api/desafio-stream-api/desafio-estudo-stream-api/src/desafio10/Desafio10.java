package desafio10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
   Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba
   o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> imparesMultiplos = numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.toList());
        
        System.out.println("Ímpares múltiplos de 3 ou 5: " + imparesMultiplos);
    }

}
