import java.util.Scanner;
import java.util.Locale;
public class EX_Condicionais8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double tax = 0.0f;
		double salary = sc.nextDouble();
		
		if(salary <= 2000.0) {
			tax = 0.0;
		}else if(salary <= 3000.0) {
			tax = (salary - 2000) * 0.08;
		}else if(salary <= 4500.0) {
			tax = (salary - 3000) * 0.18 +  1000.0 * 0.08;
		}else {
			tax = (salary - 4500.0) * 0.28 +  1500.0 * 0.18 + 1000.0 * 0.8;
		}
		
		if(tax == 0.0) {
			System.out.println("Free");
		}else {
			System.out.printf("R$ %.2f%n", tax);
		}
		
		sc.close();
		
	}

}
