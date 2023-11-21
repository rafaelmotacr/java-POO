import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> Type Your name: ");
		String name = sc.next();
		System.out.print("> Hello," + name + "!");
		
		sc.close();

	}

}
