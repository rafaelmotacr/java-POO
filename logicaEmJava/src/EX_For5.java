import java.util.Scanner;

public class EX_For5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fat = 1;
		
		int input = sc.nextInt();
		
		for(int index = 1; index <= input; index ++) {
			fat *= index;		
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
