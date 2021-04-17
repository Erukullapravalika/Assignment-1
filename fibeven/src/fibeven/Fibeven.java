package fibeven;

public class Fibeven {

	public static void main(String[] args) {
		int n=0,n1=0,n2=1;
   	 for(int i=0;i<=50;i++) {
   		 n1=n2;
   		 n2=n;
   		 n=n1+n2;
   		 if(n1 % 2==0 && n1>100 && n1<1000)
   		
   	 System.out.println(n1 + " ");
   	 }
	}

}

