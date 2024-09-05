package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
//https://leetcode.com/problems/contains-duplicate/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,1,1,3,4,5};
		System.out.println(containsDuplicate(nums));

	}
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        } 
        return false;
    }

}
