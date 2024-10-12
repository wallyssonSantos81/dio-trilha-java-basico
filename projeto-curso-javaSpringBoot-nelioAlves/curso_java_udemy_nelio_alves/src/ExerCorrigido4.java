import java.util.Locale;
import java.util.Scanner;

public class ExerCorrigido4 {

	public static void main(String[] args) {
		
		
		Scanner imput = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println(" Informe quatro valores: ");
		double a = imput.nextDouble();
		double b = imput.nextDouble();
		double c = imput.nextDouble();
		double d = imput.nextDouble();
		
		double diferenca = ( a*b - c*d);
		
		System.out.println(" A resposta é: "+ diferenca);
		
		
		imput.close();
	}

}
