//Java Operators
//used to perform operations on variables and values
public class Basicoperation{
	public static void main(String[] args){

		int  x = 100 + 20;
		//100 and 50 are called operand 
		// + is called operator
		System.out.println(x);

		int firstsum = 150 + 30;
		int secondsum = firstsum + 60;
		int lastsum = secondsum  + firstsum;
		System.out.println(firstsum);
		System.out.println(secondsum);
		System.out.println(lastsum);
		System.out.println(firstsum + secondsum + lastsum);

		//Arithmetic Operators
		//used to perform common mathematical operations
		int a = 80;
		int b = 20;
		System.out.println(a+b);//addition
		//add together 2 values
		System.out.println(a-b);//subtraction
		//subtraction one value from another
		System.out.println(a*b);//multiplication
		//multiplies two values	
		System.out.println(a/b);//division
		//divides one value from another
		System.out.println(a%b);//modulus
		//returns the division remainder
		a++;//increment
		System.out.println(a);//increases the value of a variable by 1	
		b--;//decrement
		System.out.println(b);//Decreases the value of a variable by 1	



	}
}
