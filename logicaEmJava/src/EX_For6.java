import java.util.Scanner;

public class EX_For6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		for(int div = 1; div <= num / 2; div++) {
			if(num % div == 0) {
				System.out.println(div);
			}
		}
		System.out.println(num);
		
		sc.close();

	}

}
