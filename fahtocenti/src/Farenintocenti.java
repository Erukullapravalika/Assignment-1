import java.util.Scanner;
public class Farenintocenti {
	static void converttocentigrade(float f) {
		float c;
		System.out.println("enter a value:");
		Scanner scanner=new Scanner(System.in);
		f=scanner.nextInt();
		if(f<0) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		else {
			c=(f-32)*5/9;
			System.out.println("the centigrade value is:"+c);
		}
		
	}

	public static void main(String[] args) {
		converttocentigrade(0);
		
		// TODO Auto-generated method stub

	}

}
