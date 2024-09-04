package Arrays;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
        int maxEle=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEle=Math.max(nums[i],maxEle);
        }
        return maxEle;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,1,1,3,4,5};
		System.out.println(majorityElement(nums));

	}

}
