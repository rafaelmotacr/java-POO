import java.util.Scanner;

public class EX_For2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		int lim = sc.nextInt();
		
		for(int i = 0; i < lim; i++) {
			int num = sc.nextInt();
			if( num >= 10 && num <= 20) {
				in += 1;
				continue;
			}
			out += 1;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
