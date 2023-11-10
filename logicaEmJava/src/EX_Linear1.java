import java.util.Scanner;;
public class EX_Linear1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int sum;
		
		System.out.print("> Enter a num: ");
		n1 = sc.nextInt();
		
		System.out.print("> Enter other num: ");
		n2 = sc.nextInt();
		
		sum = n1 + n2;
		System.out.println("> SUM = " + sum);
		
		sc.close();
	}

}