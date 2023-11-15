import java.util.Scanner;
public class EX_Condicionais9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean par = num % 2 == 0 ? true:false;
		if(par) {
			System.out.println("> É par!");
		}
		else {
			System.out.println("> É inpar!");
		}
		
		sc.close();
		
	}

}
