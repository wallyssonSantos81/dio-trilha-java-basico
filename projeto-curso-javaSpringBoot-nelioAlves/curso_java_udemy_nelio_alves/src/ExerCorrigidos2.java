import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigidos2 {

	public static void main(String[] args) {
		
		
		Scanner imput = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println(" Informe o primeiro valor: ");
		double valor1 = imput.nextDouble();
		System.out.println(" Informe o segundo valor: ");
		double valor2 = imput.nextDouble();
		
		double soma = valor1 + valor2;
		
		System.out.printf(" A soma é:%.2f%n", soma);
		
		
		imput.close();
	}

}
