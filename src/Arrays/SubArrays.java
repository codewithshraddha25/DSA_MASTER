package Arrays;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {-1,-2,-5,-2,-3,-4};
		printSubArrays(numbers);
	}

	private static void printSubArrays(int[] numbers) {
		// TODO Auto-generated method stub
		int totalSum=0;
		for (int i = 0; i < numbers.length; i++) {
			int start=i;
			for (int j = i; j < numbers.length; j++) {
				int end=j;
				for (int k = start; k <= end; k++) {//pring
					System.out.print(numbers[k]+" ");//subarray
				}
				totalSum++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(totalSum);
		
	}

}
