package application;
import java.util.Scanner;


public class Program {
	
	public static void main(String args[]) {
		
		
		int numbers[] = null;
		int tmp;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("> Enter a number greater than 10: ");
			tmp = sc.nextInt();
			
			while(tmp < 10) {
				
				System.out.println("> The number should be greater than 10! ");
				System.out.print("> Enter a number greater than 10: ");
				tmp = sc.nextInt();
				
			}
			
			numbers[i] = tmp;
			
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(numbers[i]);
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
