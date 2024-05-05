class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
//         Time taken is more
//         int count=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;i<nums.length;j++){
            
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }

            

//         }            return false;
        
        
        
        
               // 2nd way 
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
            
        }
        return false;
        
        //3rd way
    
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i+=2){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
            
//         }
//         return false; 
        
      
    }
}