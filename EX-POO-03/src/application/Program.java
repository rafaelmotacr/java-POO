package application;

import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student s1 = new Student();
		
		s1.name = sc.nextLine();
		s1.grade1 = sc.nextDouble();
		s1.grade2 = sc.nextDouble();
		s1.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", s1.finalGrade()));
		
		if(!s1.isAproved()) {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", s1.missingPoints()) + " POINTS");			
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
		
	}

}
