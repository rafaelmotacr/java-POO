import java.util.Scanner;
public class EX_Linear3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		int difference;
		
		System.out.print("> Enter four numbers: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		difference = A * B - C * D;
		System.out.print("> DIFFERENCE: " + difference);
		
		sc.close();
	}

}