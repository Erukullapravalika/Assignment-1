
public class Primenum {

	public static void main(String[] args) {
		int number,count=0;
		number=Integer.parseInt(args[0]);
		for(int i=2;i<=number-1;i++) 
		{
			if(number%i==0)
			{
				count=count+1;
			}
		}
			if(count>0) 
			{
				System.out.println("number is not prime");
			
			}
			else 
			{
				System.out.println("number is prime");
				
			}
		
		// TODO Auto-generated method stub
	}

}
