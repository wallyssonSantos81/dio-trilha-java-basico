import java.util.Locale;
import java.util.Scanner;

public class EcerCorregido5 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println(" Informe o nome do colaborador: ");
		String nome = imput.next();
		System.out.println(" Digite a matricula do  funcionario: ");
		double matricula = imput.nextDouble();
		System.out.println(" Informe quantas horas trabalhada: ");
		double horas = imput.nextDouble();
		System.out.println(" Digite o valor da hora trabalhanda: ");
		double valorDaHora = imput.nextDouble();
		
		
		double salario = horas* valorDaHora;
		
		System.out.println(" O mone do colaborador é: "+nome);
		System.out.println(" A matricula do colaborador: "+matricula);
		System.out.println(" A quantidade de horas trabalhada é R$: "+ horas);
		System.out.printf(" O total de horas trabalhada é R$:%.2f%n ",salario);
		
		
		imput.close();
	}

}
