import java.util.Scanner;
public class Poweroftwo {
	public static int poweroftwo(int n) {
		
		if(n<=0) {
			System.out.println("number is too small");
			
		}
		else if(n>32767) {
			System.out.println("number is too large");
			while(n!=1)
			{
				if(n %2!=0)
					return -1;
				n=n/2;
			}
	
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int i=poweroftwo(num);
		if(i<0)
			System.out.println("N0");
		else
			System.out.println("YES");
	}
}
