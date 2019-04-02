import java.util.Arrays;
public class getMin{
public static void main (String args[]){
	int[] nums = {7,8,9,0,-1,-6,-8,5,6,7};
	for(int i: nums)
	   {
		System.out.print(i + " ");
	   }	
	System.out.print("\n");
	Arrays.sort(nums);
	System.out.println("Minimum = " + nums[0]);
	System.out.println("Maximum = " + nums[nums.length-1]);	
	}
}
