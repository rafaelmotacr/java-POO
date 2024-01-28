package application;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle r1 = new Rectangle();
		
		System.out.println("> Enter rectangle Width and Height: ");
		r1.Width = sc.nextDouble();
		r1.Height = sc.nextDouble();
		
		System.out.println("=-=-=-=|OUTPUT|=-=-=-=");
		
		System.out.println("> AREA: " + r1.Area());
		System.out.println("> PERIMETER: " + r1.Perimeter());
		System.out.println("> DIAGONAL: " + r1.Diagonal());
		
		sc.close();
	}
	
}
