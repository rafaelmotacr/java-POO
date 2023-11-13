import java.util.Scanner;
import java.util.Locale;

public class EX_For3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int lim = sc.nextInt();
		
		for(int i = 0; i < lim; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("divisao imposivel");
				
			}else {
				System.out.println((double) n1 / n2);
			}
			
		}
		
		sc.close();

	}

}
