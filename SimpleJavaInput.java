import java.util.*;
public class SimpleJavaInput{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String vString = scanner.next();
		int vInt = scanner.nextInt();
		scanner.close();

		System.out.println("String input is: " + vString);
		System.out.println("Integer input is: " + vInt);
	}
}
