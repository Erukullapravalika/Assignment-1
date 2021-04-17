
public class Fibsum {
	public static void main(String[] args) {
		int n=0,n1=1,n2,sum=0;
		for(int i=1;i<100;i++) {
			n2=n1+n;
			if(n2%2!=0)
				sum=sum+n2;
			n=n1;
			n1=n2;
			if(n2>100)
				System.exit(0);
			
			System.out.println("sum="+sum);
			
					
		}


		// TODO Auto-generated method stub

	}

}
