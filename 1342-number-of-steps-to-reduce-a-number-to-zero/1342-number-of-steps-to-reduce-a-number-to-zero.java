class Solution {
    public int numberOfSteps(int num) {
    
        
        return helper(num,0);
    }
    public int helper(int n,int s){
        
            if(n==0){
            return s;
        }
        if(n%2==0){
            return helper(n/2,s+1);
        }
        
        return helper(n-1,s+1);
    }
}