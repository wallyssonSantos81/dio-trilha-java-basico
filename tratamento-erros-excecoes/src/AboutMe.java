import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try{
        // Criando um Objeto Scanner
        Scanner imput = new Scanner(System.in).useLocale(Locale.US);


        System.out.println(" Digite seu Nome:");
        String nome = imput.nextLine();
        System.out.println(" Digite seu Sobre Nome :");
        String sobreNome = imput.nextLine();
        System.out.println(" Digite sua Idade:");
        int idade = imput.nextInt();
        System.out.println(" Digite sua Altura:");
        double altura = imput.nextDouble();

        // Imprimar os dados informado, pelo usuario 
        System.out.println("Olá! me chamou " + nome.toUpperCase() + sobreNome + " ");
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha Altura é: " + altura + " cm");

        imput.close();
        }
        catch(InputMismatchException e){
            System.out.println(" Os campos idade e altura, precisam ser numericos e separados por ponto e não virgulas.");
            
        }
    }
}
