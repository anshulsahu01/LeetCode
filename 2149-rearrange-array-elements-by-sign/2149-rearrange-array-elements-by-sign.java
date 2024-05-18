class Solution {
    public int[] rearrangeArray(int[] nums) {
         int l=nums.length;
        int s=0,e=1;
        
//         while(e<l-1){
            
//             if(nums[e]<0){
//                 System.out.print(nums[s]);
//                 int temp=nums[e];
//                 nums[e]=nums[s];
//                 nums[s]=temp;
                
//                 s+=2;
//                 e+=2;
//             }
//             else{
//                   s++;
//                 e++;
                
//             }
//         }
        
        int[] arr=new int[l];
        
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                arr[s]=nums[i];
                s+=2;
            }else{
                arr[e]=nums[i];
                e+=2;
            }
        }
        return arr;
    }
}