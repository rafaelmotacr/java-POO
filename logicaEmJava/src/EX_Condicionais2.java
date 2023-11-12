import java.util.Scanner;
public class EX_Condicionais2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("PAIR");
		}else {
			System.out.println("UNPAIR");
		}
		
		sc.close();

	}

}
