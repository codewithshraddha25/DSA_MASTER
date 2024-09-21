package Arrays;
//153. Find Minimum in Rotated Sorted Array
public class SearchMinInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMin(new int[] {3,1,2}));

	}
	public static int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(nums[left]<=nums[mid]){
                    min=Math.min(min,nums[left]);
                    //eliminate the left part
                    left=mid+1;
            }else{
                
                min=Math.min(min,nums[mid]); 
                right=mid-1;
            }
        }
        return min;
    }

}
