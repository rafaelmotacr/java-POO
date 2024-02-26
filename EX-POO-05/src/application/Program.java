package application;

import entities.User;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String accountNumber;
		String holderName;
		char initialDepositChoice;
		double initialBalance;
		User u1;
		
		System.out.print("> Enter account number: ");
		accountNumber = sc.nextLine();
		System.out.print("> Enter account holder: ");
		holderName = sc.nextLine();
		System.out.print("> Is there an initial deposit? (Y/N): ");
		initialDepositChoice = sc.next().charAt(0);
 		
		if(initialDepositChoice == 'Y') {
			System.out.print("> Enter initial deposit value: ");
			initialBalance = sc.nextDouble();
			u1 = new User(initialBalance, accountNumber, holderName);
			
		}
		else if(initialDepositChoice == 'N') {
			u1 = new User(accountNumber, holderName);
			
		}
		else {
			System.out.println("> INVALID ENTRY!!!");
			sc.close();
			return;
		}
		
		System.out.println();
		System.out.println("> Account data: ");
		System.out.println(u1);
		System.out.println();
		
		double deposit;
		System.out.print("> Enter a deposit value: ");
		deposit = sc.nextDouble();
		u1.deposit(deposit);
		
		System.out.println("> Updated account data: ");
		System.out.println(u1);
		System.out.println();
		
		double withdraw;
		System.out.print("> Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		u1.withdraw(withdraw);
		
		System.out.println("> Updated account data: ");
		System.out.println(u1);
		System.out.println();
		
		sc.close();
	}

}
