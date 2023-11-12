import java.util.Scanner;
public class EX_Condicionais1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		num = sc.nextInt();
		if(num >= 0) {
			System.out.println("NOT NEGATIVE");
		}else {
			System.out.println("NEGATIVE");
		}
	
		sc.close();
	}

}
