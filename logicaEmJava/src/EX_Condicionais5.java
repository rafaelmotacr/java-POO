import java.util.Scanner;
import java.util.Locale;
public class EX_Condicionais5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total = 0.0f;
		
		switch(cod) {
			case 1:{
				total = qtd * 4.00f;
				break;
			}
			case 2:{
				total = qtd * 4.50f;
				break;
			}
			case 3:{
				total = qtd * 5.00f;
				break;
			}
			case 4:{
				total = qtd * 2.00f;
				break;
			}
			case 5:{
				total = qtd * 1.50f;
				break;
			}
			default:{
				System.out.println("INVALID PRODUCT");
			}
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
		
	}

}
