import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigido8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		char resposta;
		
		do {
		
		System.out.print(" Digite a temperatura em Celsius: ");
		double c = imput.nextDouble();
		double f = (9.0 * c) / 5.0 + 32.0;
		System.out.printf(" O valor equivalente em Fahrenheit %.1f%n", f);
		System.out.println(" Deseja repertir ?  S = Sim ou N = Não");
		resposta = imput.next().charAt(0);
		} while(resposta !='n');
	
		imput.close();
	}
}
