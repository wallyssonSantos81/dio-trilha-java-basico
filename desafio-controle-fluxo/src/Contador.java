   // Contador.java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar os dois números
        System.out.print("Digite o primeiro número: ");
        int parametro1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int parametro2 = scanner.nextInt();
        
        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diferenca = parametro2 - parametro1;

        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


