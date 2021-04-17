import java.util.Scanner;
public class Oddevenavg {
	public static float oddEvenSum(int[] a, int size) {
		int odd = 0, even = 0;	
		for (int i = 0; i < size; i++) {
			
			 if(a[i] % 2 == 0) 
			 {
				even = even + a[i];
			}
			else {
				odd = odd + a[i];

		}
		}
		float avg = (odd + even) / 2f;
		return avg;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = scanner.nextInt();
		if(size<0)
			System.out.println("Invalid number");
		System.exit(0);
		System.out.println("Enter " + size + " integer elements");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Password= " + oddEvenSum(arr, size));


	}

}
