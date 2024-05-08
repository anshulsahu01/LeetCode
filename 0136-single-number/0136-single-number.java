class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
       return nums[nums.length-1];

        
        //2nd way
//         int ans;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=nums[i+1]){
//                 ans=i;
//                 return nums[i];
//             }
//         }
//         return -1;
        
        
    }
}