class Solution {
    // static int index=0;
    
    public int search(int[] arr, int target) {
        int start =0;
        int end =arr.length-1;
        
      while(start<=end){
          int mid =start +(end-start)/2;
          
          if(target<arr[mid]){
              end =mid -1;
              
          }else if(target>arr[mid]){
              start =mid +1;
              
          }else{
              return mid;
          }
      }return -1;
        
        
//         if(arr[index]==arr.length){
//             return -1;
//         }
//         if(arr[index]==target){
//             return index;
//         }
//         ++index;
//         return search(arr,target);
        
    }  
}