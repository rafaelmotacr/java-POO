import java.util.Scanner;
public class EX_Linear2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float pi = 3.14159f;
		float area;
		float radius;
		
		System.out.print("> Enter circle radius: ");
		radius = sc.nextFloat();
		
		area = (float) (pi * Math.pow(radius, 2));
		System.out.printf("> A = %.4f", area);
		System.out.print("OI");
		
		sc.close();
	}

}
