import java.util.Scanner;

public class ReverseElementOftheArray {

	public static void main(String[] args) {
		int arr[]=new int[6];
		System.out.println("Please Enter the array to reverse :");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Entered Array is :");
		printArray(arr);
		reverseArray(arr);
	}
	
	private static void reverseArray(int[] arr) {
		
		int temp=0;
		int low=0,high=arr.length-1;
		while(low<high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		System.out.println("The array has been reversed :");
		printArray(arr);
		
	}

	public static void printArray(int arr[]) {
		
		int len=arr.length;
		for(int i=0;i<len;i++) {
			System.out.println(" "+arr[i]);
		}
	}

}
