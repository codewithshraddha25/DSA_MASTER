package Arrays;

public class RemoveElement_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeElement(new int[]{2,2,3},2);

	}
	public static int removeElement(int[] nums, int val) {
		int start=0;
        int end=nums.length-1;
        
        while(start<end){
            if(nums[end]==val){
                end--;
            }else if(nums[start]==val){
                nums[start]=nums[start]^nums[end];
                nums[end]=nums[start]^nums[end];
                nums[start]=nums[start]^nums[end];
                start++;
                end--;
            }else{
                start++;
            }
        }
        if(end==start && nums[end]==val && nums[start]==val && nums.length<3){
            return 0;
        }else if(nums.length==3 && nums[end]==val) {
        	return end;
        }else if(nums.length>3 && nums[end]==val){
            return end;
        }
        
        return end+1;
    }

}
