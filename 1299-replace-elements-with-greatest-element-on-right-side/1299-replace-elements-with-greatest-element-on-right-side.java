class Solution {
    public int[] replaceElements(int[] arr) {
        // if(arr.length<2){
        //     return -1;
        // }
        
        for(int i=0;i<arr.length;i++){
            int m=-1;
            for(int j=i+1;j<arr.length;j++){
                m=Math.max(arr[j],m);
            }
            arr[i]=m;
        }
        return arr;
        
        
        
    }
}