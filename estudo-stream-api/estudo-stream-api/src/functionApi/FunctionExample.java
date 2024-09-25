package functionApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Representa um função que aceita um argumento do tipo "T" e retorna um resultado do tipo "R".
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipo.
 */

public class FunctionExample {
    public static void main(String[] args) {
        // Criar um lista de numeros interiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usa a fuction com a expressão lambda para obter todos os numeros 
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função dobrar todos os números no Stream e armazená-las em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }

}
