package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public Employee() {
		
	}
	
	
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * (percentage / 100));
	}
	
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		
		
	}
}
