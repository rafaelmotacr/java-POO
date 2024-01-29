package application;

import entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee e1 = new Employee();
		
		System.out.print("> NAME: ");
		e1.name = sc.nextLine();
		System.out.print("> GROSS SALARY: ");
		e1.grossSalary = sc.nextDouble();
		System.out.print("> TAX: ");
		e1.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("> EMPLOYEE" + e1);
		System.out.println();
		
		System.out.println("> Wich percentage to increase salary?: ");
		double increase = sc.nextDouble();
		e1.IncreaseSalary(increase);
		
		System.out.println();
		System.out.println("> UPDATED DATA: " + e1);		
		
		sc.close();
		
	}

}
