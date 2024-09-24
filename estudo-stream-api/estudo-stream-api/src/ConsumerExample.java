import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        //Criar uma lista de números inteiros.
        List<Integer>numeros = Arrays.asList(1,2,3,4,5);

        //Use o Consumer com expressão Lambad para imprimir os pares.
        Consumer<Integer>imprimirNumerosPar = numero->{
            if(numero % 2 ==0){
                System.out.println(numero);

            }
        };
        // Usar o Consumer para imprimir números pares no Sistema
        numeros.forEach(n-> {
            if(n % 2 == 0){
                System.out.println(n);
            
                }
        
             }
        );
    }

}