import java.util.Scanner;

public class EX_While3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;

		int code = sc.nextInt();

		while (code != 4) {
			switch (code) {
				case 1: {
					alcohol += 1;
					break;
				}
				case 2: {
					gasoline += 1;
					break;
				}
				case 3: {
					diesel += 1;
					break;
				}
				case 4: {
					break;
				}
				default: {
					System.out.println("Invalid Code");
				}
			}
			
			code = sc.nextInt();
		}
		

		System.out.println("Thank You So Much!");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
