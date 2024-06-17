class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int ans=0;
        Arrays.sort(nums);
        
    
        int left=0;
        int right=nums.length-1;
        
        while(left<right){

            int sum = nums[left]+nums[right];
            if(sum<k){
                left++;
            }else if(sum>k){
                right--;
            }
            else{
                ans++;
                left++;
                right--;
            }
        }
        return ans;
        
    }
}