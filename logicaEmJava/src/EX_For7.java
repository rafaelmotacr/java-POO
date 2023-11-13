import java.util.Scanner;

public class EX_For7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int index = 1; index <= n; index ++) {
			int square = index * index;
			int cube = index * index * index;
			System.out.printf("%d %d %d %n", index, square, cube);
		}
		
		sc.close();
		
	}

}
