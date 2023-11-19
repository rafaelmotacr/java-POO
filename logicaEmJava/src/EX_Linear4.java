import java.util.Locale;
import java.util.Scanner;
public class EX_Linear4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int empNum;
		int workedHours;
		float hourlyRate;
		float salary;
		
		System.out.print("> Enter Your Employe Num: ");
		empNum = sc.nextInt();
		
		System.out.print("> Enter Your Worked Hours: ");
		workedHours = sc.nextInt();
		
		System.out.print("> Enter Your Hourly Rate: ");
		hourlyRate = sc.nextFloat();
		
		salary = workedHours * hourlyRate;
		System.out.println("NUMBER = " + empNum);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}

}
