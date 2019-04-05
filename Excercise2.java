import java.util.Scanner;

public class Excercise3{
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	System.out.print("Input the number: ");
 	int num1 = input.nextInt();

 	System.out.print("Input the another number: ");
 	int num2 = input.nextInt();

 	int result = num1*num2;
 	//System.out.println();
 	System.out.println(num1+" x "+num2+ " = "+result);

	}
}