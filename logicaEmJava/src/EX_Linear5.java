import java.util.Scanner;
import java.util.Locale;
public class EX_Linear5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code1, code2;
		int qtd1, qtd2;
		float value1, value2;
		float total;
		
		code1 = sc.nextInt();
		qtd1 = sc.nextInt();
		value1 = sc.nextFloat();
		
		code2 = sc.nextInt();
		qtd2 = sc.nextInt();
		value2 = sc.nextFloat();
		
		total = (float) qtd1 * value1 + qtd2 * value2;
		System.out.println("> CODE OF PRODUCT ONE: " + code1);
		System.out.println("> CODE OF PRODUCT TWO: " + code2);
		System.out.printf("> AMOUNT TO BE PAID: R$ %.2f", total);
		
		sc.close();
	}
}
