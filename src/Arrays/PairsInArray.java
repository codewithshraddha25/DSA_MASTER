package Arrays;

public class PairsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,4,6,8,10};
		pairInArray(numbers);
	}

	private static void pairInArray(int[] numbers) {
		// TODO Auto-generated method stub
		int totalPair=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				System.out.print("( "+ numbers[i]+" , "+numbers[j]+" )");
				totalPair++;
			}
			System.out.println();
		}
		System.out.println(totalPair);
		//total number of pairs can be calculated with the help of total numbers in array
		//(n*(n-1))/2 is formula which gives total number of pair
	}

}
