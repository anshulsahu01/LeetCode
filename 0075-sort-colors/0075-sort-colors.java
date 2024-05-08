class Solution {
    public void sortColors(int[] nums) {
        
        //1st way 
        
//         Arrays.sort(nums);
//         System.out.print(Arrays.toString(nums));
        
        // 2nd
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    
                }
            }
        }
                 System.out.print(Arrays.toString(nums));
        
        
    }
}