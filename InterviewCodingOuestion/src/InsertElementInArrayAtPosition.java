import java.util.Scanner;

public class InsertElementInArrayAtPosition {

	public static void main(String[] args) {
		
		
		int arr[]=new int [5];
		System.out.println("Please Enter the array :");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int el:arr) {
			System.out.println("Entered element is :"+el);
		}
		
		System.out.println("Enter the location to insert element in the array:");
		int location =scan.nextInt();
		System.out.println("Enter the value to insert in the array");
		int value=scan.nextInt();
		insertEleAtgivenPosition(arr,location,value);

	}

	private static void insertEleAtgivenPosition(int[] arr, int location, int value) {
		if(arr.length<1) {
			System.out.println("Please enter the more then one element :");
		}
		if(location<0) {
			System.out.println("Invalid location!Please enter the valid location (0 to n)");
		}
		for(int i=arr.length-1;i>location;i--) 
			arr[i]=arr[i-1];
		
		arr[location]=value;
		for(int ele:arr) {
			System.out.println("New Array !After insertion :"+ele);
		}
	}

}
