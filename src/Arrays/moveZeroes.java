package Arrays;
//283. Move Zeroes
//move zeroes and maintain order of non zero elements array problem
public class moveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveZeroes( new int[] {1,0,2,13,0,0,4});
	}
	
	public static void moveZeroes(int[] nums) {
        int insertPosition=0;
        for(int i=0;i<nums.length;i++){
            //fill all non zero numbers
            if(nums[i] != 0){
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        while(insertPosition < nums.length){//to add zeros after non zeros
            nums[insertPosition++]=0;
        }
       for(int i=0;i<nums.length;i++) {
    	   System.out.println(nums[i]);
       }
    }

}
