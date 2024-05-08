class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int result=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                result=Math.max(result,count);
                //max value find krne ke liye max ka use krte hai
            }
            else{
                count=0;
            }
        }return result;
        
    }
}