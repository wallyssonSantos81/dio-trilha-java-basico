package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		
		System.out.println(" Enter Radius: ");
		double radius = imput.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf(" Circumference: %.2f%n", c);
		System.out.printf(" Volume: %.2f%n", v);
		System.out.printf(" PI value: %.2f%n", Calculator.PI);
		
		imput.close();
	}

}
