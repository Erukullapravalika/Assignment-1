import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number:");
		num1=scanner.nextInt();
		System.out.println("enter second number:");
		num2=scanner.nextInt();
		sum=num1+num2;
		System.out.println("the sum of these numbers is:" +sum);
	}

}
