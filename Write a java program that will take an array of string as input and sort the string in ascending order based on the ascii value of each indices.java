import java.util.Scanner;

public class B {
	public static void main(String []args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:\n");
		n = sc.nextInt();
		String arr[]= new String[n];
		System.out.print("Enter array:\n");
		for(int i=0;i<n;i++) {
			arr[i]= sc.next();
		}
		for(int i=0; i<n-1;i++) {
			for(int j=0; j<n-i-1;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		System.out.print("\nSorted array: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");	
	}
}
