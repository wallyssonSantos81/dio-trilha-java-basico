import java.util.Scanner;

public class ExerCorrigido7 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Digite os valores");
		int x = imput.nextInt();
		
		int soma =0;
		
		while( x!=0) {
			soma = soma + x;
			x = imput.nextInt();
			System.out.println(soma);
		}
		imput.close();
	}
}
