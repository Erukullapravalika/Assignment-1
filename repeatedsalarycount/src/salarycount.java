import java.util.Scanner;
public class salarycount {
	public static int countRepeaters(int[] salary, int arraySize) {
		int count = 1;
		for (int i = 0; i<arraySize; i++) {
			for (int j = i + 1; j <arraySize - 1; j++) {
				if (salary[i] == salary[j])
					count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many persons salary you want to enter :");
		int personCount = sc.nextInt();
		if (personCount< 0) {
			System.out.println("Invalid Input");
			System.exit(personCount);
		}
		
		System.out.println("Enter " + personCount + " persons salary");
		int[] sals = new int[personCount];
		
		for (int i = 0; i<personCount; i++) {
			sals[i] = sc.nextInt();
			if (sals[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(i);
			}
		}
		
		int count = countRepeaters(sals, personCount);


		System.out.println(count);
	}


}


	

