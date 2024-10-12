package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Triangulo;

public class Programar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println(" Informe os Valores do Triangulo X: ");
		x.a = imput.nextDouble();
		x.b = imput.nextDouble();
		x.c = imput.nextDouble();
		
		System.out.println(" Informe os Valores do Triangulo Y: ");
		y.a = imput.nextDouble();
		y.b = imput.nextDouble();
		y.c = imput.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf(" A area do Triangulo X é: %.4f%n", areaX);
		System.out.printf(" A area do Triangulo Y é: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println(" Maior area é do Triangulo X ");
		}else {
			System.out.println(" Maior area é do Triangulo y ");
		}
		imput.close();
	}

}
