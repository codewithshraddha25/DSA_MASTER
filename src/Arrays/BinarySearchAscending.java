package Arrays;

public class BinarySearchAscending {
	
	

	public static void main(String[] args) {
		//int[] arr = {2, 3, 4, 10, 40}; // Example sorted array
		int[] arr = {2, 3, 4, 10, 40, 50};
        int key = 2; // Element to search

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }

	}

	private static int binarySearch(int[] arr, int key) {
		int start=0;
		int end=arr.length-1;

		while(start<=end) {//start should not cross to end
			int mid= start+(end-start)/2;//to avoid overflow of int values

			if(arr[mid]==key) {
				return mid;
			}else if(key<arr[mid]) {
				end=mid-1;
			}else if(key>arr[mid]) {
				start=mid+1;
			}
		}
		return -1;
	}

}
