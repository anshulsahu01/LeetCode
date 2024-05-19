class Solution {
    public int searchInsert(int[] nums, int target) {
//         int start =0;
//         int end =arr.length-1;
//         int ans=0;
        
     
//         while(start<end){
//             int mid =start +(end-start)/2;

//             if(target<arr[mid]){
//                 end =mid -1;

//             }else if(target>arr[mid]){
//                 start =mid +1;

//             }else{
// //                 ans = mid + 1;
//                 start = mid + 1;
//                }

//         }return ans;
        
    int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return ans;  
    }
}