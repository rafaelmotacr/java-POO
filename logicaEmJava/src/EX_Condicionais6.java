import java.util.Scanner;
public class EX_Condicionais6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		if(num < 0 || num > 100) {
			System.out.println("Out of interval");
		}
		else if(num <= 25) {
			System.out.println("Interval [0,25]");
		}else if(num <= 50) {
			System.out.println("Interval (25, 50]");
		}else if(num <= 75) {
			System.out.println("Interval (50,75]");
		}else {
			System.out.println("Interval (75,100]");
		}
		
		sc.close();
		
	}

}
