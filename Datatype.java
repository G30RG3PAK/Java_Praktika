//Java Data types
//a variable in Java must be a specified data type
public class Datatype{
	public static void main(String[] args){

		//Numbers
		//Interger types--> number(+/-),without decimals
		//Valid types are byte,short,int,long
		byte num1 = 110;//-128 to 127
		System.out.println(num1);
		//used instead of int to save memory
		
		short num2 = 1598;//-32768 to 32767
		System.out.println(num2);

		int num3 = 154789;//-2147483648 to 147483647
		System.out.println(num3);
		
		//-9223372036854775808 to 9223372036854775808.
		long num4 = 15478963215874L;//should end the value with "L"
		System.out.println(num4);//used when int is not large enough


		//Floating point type--> numbers with fractional part(+/-), one or more decimal
		//Valid types are float and double
		float num5 = 6.66f; //3.4e−038 to 3.4e+038
		System.out.println(num5);
		//should end the value with "f"

		//store fractional numbers from 1.7e−308 to 1.7e+038
		double num6 = 789.56d;//should end the value with 'd'
		System.out.println(num6);


		//Scientific Numbers?
		float sc1 = 48e3f; //an "e" to indicate the power of 10
		double sc2 = 46E4d;
		System.out.println(sc1);
		System.out.println(sc2);

		boolean isJavaFun = true;
		boolean areYouNoob = false;
		System.out.println(isJavaFun);
		System.out.println(areYouNoob);

		char myidealGrade = 'A';//single character
		System.out.println(myidealGrade);

		//use ASCII values to display certain character
		char a = 65, b = 66, c = 67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//Sequence of character
		String text = "Hello world";
		System.out.println(text);

		
	}
}
