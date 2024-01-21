package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
	
		System.out.println("> Enter product data: ");
		System.out.print("> Name: ");
		p1.name = sc.nextLine();
		System.out.print("> Price: ");
		p1.price = sc.nextDouble();
		System.out.print("> Quantity in stock: ");
		p1.quantity = sc.nextInt();
		
		sc.close();
		
	}

}
