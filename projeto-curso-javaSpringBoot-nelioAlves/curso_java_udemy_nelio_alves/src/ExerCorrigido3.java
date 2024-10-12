import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigido3 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println(" Informe o valor do Raio: ");
		double raio = imput.nextDouble();

		double PI = 3.14159;
		
		double areaFinal= PI*(raio*raio);
		System.out.printf(" O tamanho da are é: %.4f%n", areaFinal);
		
		imput.close();

	}

}
