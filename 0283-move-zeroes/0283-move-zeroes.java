class Solution {
    public void moveZeroes(int[] num) {
        
        int size=num.length;
        if(size==0|| size==1){
            return ;
        }
        
        int end =0;
        int start=0;
        
        while(end<size){
            //swap krna hai values change ho rai hai
            if(num[end]!=0){
                int temp= num[end];
                num[end]=num[start];
                num[start]=temp;
                
                end++;
                start++;
                
            }
            else{
                end++;
            }
        }
        
    }
}