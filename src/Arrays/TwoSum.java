package Arrays;

import java.util.*;

public class TwoSum {
//input is given array and sum, that sum will add any two numbers from array
	public static void main(String[] args) {
	int[] arr= {10,2,3,4,5,6};
	int target=8;
	int[] output=twoSum(arr,target);
	Arrays.stream(output).forEach(System.out::println);
	/*
	 * for(int i=0;i<output.length;i++) { System.out.println(output[i]); }
	 */
	}
	
	
	public static int[] twoSum(int[] arr,int target) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
	    
	    for(int i = 0; i < arr.length; i++) {
	        if(map.containsKey(arr[i])) {
	            return new int[] {i, map.get(arr[i])};
	        }

	        map.put(target - arr[i], i);
	        System.out.println(map);
	    }
	    
	    return new int[]{}; 
	    
	}

}
