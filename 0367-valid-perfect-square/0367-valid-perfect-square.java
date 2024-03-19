class Solution {
    public boolean isPerfectSquare(int num) {
         int temp =num-(num/2);
        
         for(int i=0;i<=temp;i++){
             
             
             if(i*i==num){
                 
                 return true;
             }
         }
         return false;
        
    }
}