import java.util.Scanner;
public class Maxmin {
	public static int maximumSum(int numbers[],int size) {
		int evenSum=0,oddSum=0;
		for(int i=0;i<size;i++) {
			if(numbers[i]%2==0) {
				evenSum+=numbers[i];
			}
			else {
				oddSum+=numbers[i];
			}
			
				
				
		}
		if(evenSum>oddSum) {
			return evenSum;
		}
		else {
			return oddSum;
		}
			
			
	}

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
System.out.println("enter a number:");
		int count = scanner.nextInt();
		if(count<0) {
			System.out.println("invalid array size");
			System.exit(count);
		}
		System.out.println("enter" + "count"+"numbers");
		int[]nums=new int[count];
		for(int i=0;i<count;i++) {
			nums[i]=scanner.nextInt();
			if(nums[i]<0) {
				System.out.println("invalid input");
				System.exit(i);
			}
			
		}
		int maxSum=maximumSum(nums,count);
		System.out.println(maxSum);
		

	}

}
