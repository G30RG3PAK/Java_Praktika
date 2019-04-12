import java.util.Scanner;

public class averageWithLoop{

	public static void main(String[] args){
	
		int num = 0;
		int x = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number : ");
		int n = input.nextInt();
		while(x <= n){
			System.out.println("Input number "+"("+(int)x+")"+":");
			num += input.nextInt();
			x++;
		}
	
		int average = (num/n);
		System.out.println("Average: "+average);		
	}
}
