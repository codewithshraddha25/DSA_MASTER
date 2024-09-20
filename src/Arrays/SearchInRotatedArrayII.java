package Arrays;
//81. Search in Rotated Sorted Array II
//search element is present in roatated array or not but elements in array can be duplicate
public class SearchInRotatedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search(new int[] {2,5,6,0,0,1,2},4));
	}

	public static boolean search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// If target is found
			if (nums[mid] == target) {
				return true;
			}
			if(nums[left]==nums[mid] && nums[mid]==nums[right]){
				right--;
				left++;
				continue;
			}

			// Determine which part is sorted
			if (nums[left] <= nums[mid]) {
				// Left part is sorted
				if (nums[left] <= target && target < nums[mid]) {
					// Target is in the left sorted part
					right = mid - 1;
				} else {
					// Target is in the right unsorted part
					left = mid + 1;
				}
			} else {
				// Right part is sorted
				if (nums[mid] < target && target <= nums[right]) {
					// Target is in the right sorted part
					left = mid + 1;
				} else {
					// Target is in the left unsorted part
					right = mid - 1;
				}
			}
		}
		// If we finish the loop, target is not found
		return false;
	}


}
