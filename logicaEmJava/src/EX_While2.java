import java.util.Scanner;

public class EX_While2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while(x != 0 && y != 0) {
			if(x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}else if(x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}else if(x > 0.0 && y < 0.0) {
				System.out.println("Q4");
				
			}else {
				System.out.println("Q3");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();

	}

}
