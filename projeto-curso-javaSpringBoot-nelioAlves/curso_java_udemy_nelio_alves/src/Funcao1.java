import java.util.Scanner;

public class Funcao1 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		System.out.println(" Digite três numeros: ");
		int num1 = imput.nextInt();
		int num2 = imput.nextInt();
		int num3 = imput.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
			
		imput.close();
	}
	public static int max( int num1, int num2, int num3) {
		int aux;
		if(num1 > num2 && num1 > num3){
			aux = num1;		
		}else if(num2 > num3) {
			aux = num2;
		}else {
			aux = num3;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println(" O maior Valor é: " +value);
	}
}
