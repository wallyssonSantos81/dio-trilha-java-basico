package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		int n = imput.nextInt();
		Product[] vect = new Product[n];
		
		for( int i=0; i<vect.length; i++) {
			imput.nextLine();
			String name = imput.nextLine();
			double price = imput.nextDouble();
			vect[i] = new Product(name,price);
		}
		double sum = 0.0;
		for(int i=0; i<vect.length;i++) {
			sum += vect[i].getPrice(); 
		}
		double avg = sum/vect.length;
		System.out.printf(" AVAREGE PRICE = %.2f%n", avg);
				
		imput.close();
	}

}
