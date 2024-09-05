package Arrays;

import java.util.Arrays;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);//n logn time
        int index= (nums.length/2);//once we sort array , 100% chance is that repeated element occurs in middle element after sort
        return nums[index];

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,2,1,1,3,3,3,3,4,5};
		System.out.println(majorityElement(nums));

	}

}
