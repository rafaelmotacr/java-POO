import java.util.Scanner;
public class EX_Linear6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float A, B, C;
		float pi = 3.14159f;
		float triangleArea;
		float circleArea;
		float trapezoidArea;
		float squareArea;
		float rectangleArea;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		triangleArea = (A * C) / 2; // Base multiplied by height and divided by two 
		circleArea = pi * (float) Math.pow(C, 2); // pi multiplied by the radius raised by two
		trapezoidArea = ((A + B) * C) / 2 ; // area = side a and side b (both bases) multiplied by height and divided by two
		squareArea = (float) Math.pow(B, 2); // Side raised by two
		rectangleArea = A * B; // width * length
		
		System.out.printf("> TRIANGLE: %.3f.\n", triangleArea);
		System.out.printf("> CIRCLE: %.3f.\n", circleArea);
		System.out.printf("> TRAPEZOID: %.3f.\n", trapezoidArea);
		System.out.printf("> SQUARE: %.3f.\n", squareArea);
		System.out.printf("> RECTANGLE: %.3f\n", rectangleArea);
		
		sc.close();

	}

}
