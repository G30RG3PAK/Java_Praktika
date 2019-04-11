import java.util.Scanner;

public class inputRadius{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the redius: ");
		double radius = input.nextDouble();

		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));	
	}
}