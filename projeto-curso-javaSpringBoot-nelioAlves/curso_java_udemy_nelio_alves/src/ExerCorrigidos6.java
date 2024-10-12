import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigidos6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Informe a Largura do Terreno: ");
		double largura = imput.nextDouble();
		
		System.out.println(" Informe o Comprimento do Terreno: ");
		double comprimento = imput.nextDouble();
		System.out.println(" Informe o Valor do Metro Quadrado do Terreno: ");
		double metroQuadrado = imput.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf(" AREA = %.2f%n", area);
		System.out.printf(" PREÇO = %.2f%n", preco);
		
		imput.close();
	}

}
