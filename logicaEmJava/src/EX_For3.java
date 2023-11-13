import java.util.Scanner;
import java.util.Locale;

public class EX_For3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int lim = sc.nextInt();
		
		for(int i = 0; i < lim; i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double average = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", average);
		}
		
		sc.close();

	}

}
