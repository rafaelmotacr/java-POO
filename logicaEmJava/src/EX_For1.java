import java.util.Scanner;

public class EX_For1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lim = sc.nextInt();
		
		for(int icont = 0; icont <= lim; icont++) {
			if(icont % 2 != 0) {
				System.out.println(icont);
			}
		}
		
		
		sc.close();

	}

}
