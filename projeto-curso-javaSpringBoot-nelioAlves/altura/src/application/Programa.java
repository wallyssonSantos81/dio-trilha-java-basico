package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Quantas pessoas seram digitadas: ");
		int n = imput.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println(" Dados da "+ (i+1) +" pessoa:");
			System.out.println("Nome: ");
			nomes[i] = imput.next();
			System.out.println("Idade: ");
			idades[i] = imput.nextInt();
			System.out.println("Altura:");
			alturas[i] = imput.nextDouble();		
		}
		double soma =0.0;
		for(int i=0; i<n; i++){
			soma = soma + alturas[i];			
		}
		double somaAlturas = soma / n;
		System.out.println();
		System.out.printf(" Altura media: %.2f%n", somaAlturas);
		
		int cont =0;
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				cont = cont +1;
			}
		}
		double percent = cont * 100.0 / n;
		System.out.printf(" Pessoas com menos de 16 anos : %.1f%%%n", percent);
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		imput.close();
		}	
		
	}


