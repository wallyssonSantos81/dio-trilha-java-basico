package predicateApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa um função que aceita argumento do tipo "T" e retorna um valor Booleano(verdadeiro ou falso),
 * É comumente usado para filtrar elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {
    //Criar uma List de palavras 
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c","go","ruby");

    //Criar um predicate que verificar se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    /**
     * Usar o Stream para filtrar as palavras comm mais de 5 caracteres e em seguida,
     *imprimir cada palavra que passou mo filtro.
     */
    palavras.stream()
    .filter(maisDeCincoCaracteres)
    .forEach(System.out::println);    
    }
    
}
