class Solution {
    public boolean canJump(int[] nums) {
        
        int l=nums.length;
        int reach=0;
        
        for(int i=0;i<l;i++){
            
            if(reach<i){
                return false;
            }
            else{
                reach =Math.max(reach, i+nums[i]);
            }
        }
        return true;
    }
}