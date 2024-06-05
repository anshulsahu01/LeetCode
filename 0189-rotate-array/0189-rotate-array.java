class Solution {
   public static void reverse(int nums[], int start, int end){
    // While start index is less than end index
    while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
    }
}

    public void rotate(int[] nums, int k) {
        // Ensure k is within array bounds
        k %= nums.length;
        // Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
        
        
        
//         int temp=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=temp;
//     }
//     public void rotate(int[] nums, int k) {
// //
//          k=k%nums.length;
//         if(k<0){
//             k=k+nums.length;
//         }
//         for(int i=1;i<=k;i++){

//             oneR(nums);
//         }
//         System.out.print(Arrays.toString(nums));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int[] temp =new int[k];
    
//         for(int i=0;i<k;i++){

//             temp[i]=nums[i];
            
//         }
        
//         for(int i=k;k<nums.length;i++){
//             nums[i-k]=nums[i];
//         }
        
//         for(int i=nums.length-k;i<nums.length;i++){
//             temp[i]=temp[i-(nums.length-k)];
//         }
//         System.out.print(Arrays.toString(nums));
    }
}