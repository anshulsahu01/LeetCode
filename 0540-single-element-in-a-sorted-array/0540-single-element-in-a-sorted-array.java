class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int i=0;
       int j=1;
        if(nums.length<2){
            return nums[0];
        }
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                return nums[i];
                
            }else{
                i=i+2;
                if(j<nums.length-2){
                    
                
                j=j+2;
                }else{
                    return nums[i];
                }
            }
        }
        return -1;
        
    }
}