import java.util.Scanner;
public class EX_Condicionais7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0f && y == 0.0f) {
			System.out.println("Origin");
		}else if(x == 0.0f) {
			System.out.println("X axis");
		}else if(y == 0.0f) {
			System.out.println("Y axis");
		}else if(x < 0.0f && y > 0.0f) {
			System.out.println("Q2");
		}else if(x > 0 && y > 0.0f) {
			System.out.println("Q1");
		}else if(x < 0.0f && y < 0.0f) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
