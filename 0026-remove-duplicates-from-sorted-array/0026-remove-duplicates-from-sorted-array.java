class Solution {
    public int removeDuplicates(int[] nums) {
        
        int rd=0; //we have used rd for storing the arr which is not repeating
        for(int i=0;i<nums.length;i++){
            
            if(nums[rd]!=nums[i]){

                rd++;
                nums[rd]=nums[i];
            }
        }return rd+1;
        
    }
}