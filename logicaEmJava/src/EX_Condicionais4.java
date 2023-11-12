import java.util.Scanner;
public class EX_Condicionais4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int initialHour = sc.nextInt();
		int finalHour = sc.nextInt();
		int duration;
		
		if(finalHour > initialHour) {
			duration = finalHour - initialHour;
		}else {
			duration = 24 - initialHour + finalHour;
		}
		
		System.out.println("> The play lasted " + duration + "hours(s)");
		
		sc.close();  

	}

}
