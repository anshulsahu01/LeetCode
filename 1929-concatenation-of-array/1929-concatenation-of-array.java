class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=2*nums.length;
        int n=nums.length;
        int[] ans =new int[size];
        
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        
        for(int i=0;i<n;i++){
            ans[i+n]=nums[i];
        }
        return ans;
        
        
    }
}