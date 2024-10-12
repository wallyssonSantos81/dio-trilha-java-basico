package program;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Quantos numeros você irá digita? ");
		int n = imput.nextInt();
		
		int[] vet = new int[n];
		for(int i=0; i<vet.length; i++) {
			System.out.print(" Digite um numero: ");
			vet[i] = imput.nextInt();
		}
		System.out.println(" Os numeros negativos.");
		for(int i=0; i<vet.length;i++) {
			if(vet[i]<0) {
				System.out.println(vet[i]);
			}
		}
		
		imput.close();
	}

}
