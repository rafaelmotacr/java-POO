import java.util.Scanner;
public class EX_For8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> Enter the prime number total: ");
		int total = sc.nextInt();
		
		int primeFounded = 0;
		int num = 1;
		
		System.out.print("> ");
		while (primeFounded < total) {
			int divisors = 0;
			for(int div = 1; div <= num / 2; div = div + 1) {
				if(num % div == 0) {
					divisors = divisors + 1;
				}
			}
			if(divisors == 1) {
				if(primeFounded == total - 2) {
					System.out.print(num + " and ");	
				}
				else if(primeFounded < total - 1){
					System.out.print(num + ", ");
				}else {
					System.out.print(num + ".");
				}
				primeFounded = primeFounded + 1;
			}
			num = num + 1;
		}
		
		sc.close();

	}

}
