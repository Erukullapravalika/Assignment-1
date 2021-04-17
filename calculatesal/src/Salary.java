import java.util.Scanner;
public class Salary {
	private static void calculatesal() {
		int shifts=0,salary=0;
 		double savings=0;
 		System.out.println("enter salary:");
 		System.out.println("enter shifts:");
 		Scanner scanner=new Scanner(System.in);
 	    salary=scanner.nextInt();
 	    shifts=scanner.nextInt();
 	    if(salary>8000)
 	    {
 	    	System.out.println("salary too large");
 	    	System.exit(0);
 	    }
 	    else if(salary<0)
 	    {
 	    	System.out.println("salary is too small");
 	   
 	    	System.exit(1);
 	    }
 	    else if(shifts<0)
 	    {
 	    	System.out.println("shifts too small");
 	    	System.exit(2);
 	    }
 	    else {
 	    	 savings=(salary*0.5)+(salary*0.02+shifts);
 	    	 System.out.println(savings);
 	    }
	}
 	   
 	    
	
 public static void main(String[] args) {
	 calculatesal();
	 
	 


}




	
}
	 
    	
    	   
          
		

	

    
