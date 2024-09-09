package Arrays;

public class InsertSearchElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,4,7,10,12,14};
		System.out.println(searchInsert(nums,9));
	}
	public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length - 1;

        while(low <= high){
            int mid =  low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

}
