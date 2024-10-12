package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		
		
		
		System.out.println(" Digite a Data do produto: ");
		System.out.print(" Nome: ");
		String nome = imput.nextLine();
		System.out.print(" Preço R$: ");
		double preco = imput.nextDouble();
		System.out.print(" Qual a quantidade em Estoque: ");
		int quantidade = imput.nextInt();
		
		Product product = new Product(nome,preco,quantidade);
		product.setNome("Computer");
		System.out.println(" Updated name: " +product.getNome());
		
		System.out.println();
		System.out.println(" Porduto data:" + product);
		
		System.out.println();
		System.out.println(" Informe quantos Produtos deseja adcionar ao Estoque:");
		quantidade = imput.nextInt();
		product.adcionarProdudo(quantidade);
		
		System.out.println();
		System.out.println(" Atualização do Porduto data:" + product);
		
		System.out.println();
		System.out.println(" Informe quantos Produtos deseja retira do Estoque:");
		quantidade = imput.nextInt();
		product.removerProduto(quantidade);
		
		System.out.println();
		System.out.println(" Atualização do Porduto data:" + product);
		
		
		imput.close();
	}

}
