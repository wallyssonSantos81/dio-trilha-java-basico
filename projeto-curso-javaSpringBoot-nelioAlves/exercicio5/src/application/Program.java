package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		Account account;
		
		System.out.print(" Enter account number: ");
		int number = imput.nextInt();
		System.out.print(" Enter account Holder: ");
		imput.nextLine();
		String holder = imput.nextLine();
		System.out.print(" Is there an initial deposit ( y/n)?: ");
		char response = imput.next().charAt(0);
		
		if(response == 'y') {
			System.out.print(" Enter initial deposit value: ");
			double initialDeposit = imput.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println(" Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print(" Enter a deposit Value: ");
		double depositValue = imput.nextDouble();
		account.deposit(depositValue);
		System.out.println(" Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print(" Enter a withdraw Value: ");
		double withdrawValue = imput.nextDouble();
		account.witdraw(withdrawValue);
		System.out.println(" Updated account data: ");
		System.out.println(account);
		
		imput.close();
	}
}
