package Arrays;

import java.util.Iterator;

public class LinearSearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,3,4,5,6,78,8,9};
		int key=4;
		int index= linearSearch(numbers,key);
		if(index==-1) {
			System.out.println("Key not found");
		}else {
			System.out.println("Key found at index "+index);
		}

	}

	private static int linearSearch(int[] numbers, int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
