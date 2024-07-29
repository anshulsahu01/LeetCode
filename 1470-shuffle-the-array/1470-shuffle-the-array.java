class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int j=0;
        int[] ans=new int[nums.length];
        int num=0;
        
        for(int i=0;i<nums.length/2;i++){
            
            ans[num]=nums[i];
            num++;
            ans[num]=nums[i+n];
            num++;
        }
        return ans;
        
    }
}