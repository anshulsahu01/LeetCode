class Solution {
    public boolean isPalindrome(int x) {
  
        //we have taken another variable so that the value of x can be stored in that it will be used for checking inn last 
        
        // and we have taken a condition if  x is negative so it can't be P so in starting we can say it is false
        
        
        int t= x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            
            rev=rev*10+x%10;
            x=x/10;
        }
        // if(x==rev){
        //     return true;
        // }
        return (rev==t);
    }
}