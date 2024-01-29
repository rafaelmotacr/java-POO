package application;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle r1 = new Rectangle();
		
		System.out.println("> Enter rectangle Width and Height: ");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
		
		System.out.println("=-=-=-=|OUTPUT|=-=-=-=");
		
		System.out.println("> AREA: " + r1.area());
		System.out.println("> PERIMETER: " + r1.perimeter());
		System.out.println("> DIAGONAL: " + r1.diagonal());
		
		sc.close();
		
	}
	
}
