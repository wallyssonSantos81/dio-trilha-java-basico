import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigidos1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Informe a largura do terreno: ");
		double largura = imput.nextDouble();
		
		System.out.println(" Informe o comprimento do terreno: ");
		double comprimento = imput.nextDouble();
		
		System.out.println(" Informe o valor do metro quadrado: ");
		double valorDoMetroQuadrado = imput.nextDouble();
		
		double area = largura * comprimento;
		
		double ValorDoterreno = area * valorDoMetroQuadrado;
		
		System.out.printf(" O tamanho da Area é: %.2f%n", area);
		System.out.printf(" O valor a ser pago pelo terreno é:%.2f%n", ValorDoterreno);
		
		imput.close();
	}

}
