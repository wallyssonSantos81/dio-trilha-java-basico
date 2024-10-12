
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" Olá, Mundo! ");
		System.out.println();
		
		double x = 10.35784;
		
		System.out.printf(" %.2f%n", x);
		System.out.printf(" %.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf(" %.2f%n", x);
		System.out.printf(" %.4f%n", x);
		System.out.println(" Resultado " + x + " Metros ");
		System.out.printf(" Resultado %.2f Metros %n", x);
		
		int idade = 42;
		String nome = " Wallisson ";
		double renda = 2800.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome, idade, renda);
	}

}
