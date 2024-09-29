package binaryOperatorApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tiopo "T", e retorna um resultado do mesmo tipo "T".
 * É usado para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

    public static void main(String[] args) {

        //Criar uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o BinaryOperator com expressão lambda, para somar dois números inteiros 
        BinaryOperator<Integer> somar = (numero1, numero2) -> numero1 + numero2;

        //Usar o BinaryOperator para somar todos os números interiors da Stream.
        int resultado = numeros.stream()
        .reduce(0,somar);

        //Imprimir o resultado da somar
        System.out.println("A somados números é:" +resultado);

    }
}
