import java.util.Scanner;
public class EX_Condicionais3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.println("ARE MULTIPLES!");
		}else if(n2 % n1 == 0) {
			System.out.println("ARE MULTIPLES!");
		}else {
			System.out.println("ARE'NT MULTIPLES!");
		}
		
		sc.close();

	}

}
