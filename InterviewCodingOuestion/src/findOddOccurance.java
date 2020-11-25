
public class findOddOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 3, 3 };
		int n = arr.length;
		findOddccurance(arr, n);
	}

	private static void findOddccurance(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count % 2 != 0) {
				System.out.println("+++++++" + arr[i]);
			}

		}

	}

}
