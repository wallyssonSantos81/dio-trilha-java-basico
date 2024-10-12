import java.util.Locale;
import java.util.Scanner;

public class ExerCorregido5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		System.out.println();

		int qte1, qte2;
		double preco1, preco2, total;

	    qte1 = imput.nextInt();
	    preco1 = imput.nextDouble();
	    
	    qte2 = imput.nextInt();
	    preco2 = imput.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		imput.close();
	}

}
