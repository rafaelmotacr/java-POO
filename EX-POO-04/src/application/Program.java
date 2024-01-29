package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double dollarValue;
		double dollarAmount;
		double totalPrice;
		
		System.out.print("> What is the dollar price today?: ");
		dollarValue = sc.nextDouble();
		System.out.print("> How many dollars Will be bought?: ");
		dollarAmount = sc.nextDouble();
		totalPrice = CurrencyConverter.dollarPrice(dollarValue, dollarAmount);
		System.out.printf("> Amount to be paid in reais = %.2f.", totalPrice);

		sc.close();
		
	}

}
