import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse{
    public static void main(String[] args){
        
        Scanner imput = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println(" Informe o seu primeiro nome: ");
        String primeiroNome = imput.next();
        System.out.println(" Informe o seu segundo nome: ");
        String segundoNome = imput.next();
        System.out.println(" Digite sua idade: ");
        int idade = imput.nextInt();
        System.out.println(" Digite a Altura: ");
        double altura = imput.nextDouble();

        System.out.println(" Olá, me chamou " + primeiroNome +" " + segundoNome);
        System.out.println(" Tenho " + idade +" anos. ");
        System.out.println(" Minha altura é: " + altura + " cm ");





    }

}