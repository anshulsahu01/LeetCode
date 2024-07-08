class Solution {
    public int smallestEvenMultiple(int n) {
        int lcm=n;
        while(n<=lcm){
            if(lcm%n==0 && lcm%2==0){
                return lcm;
            }
            lcm++;
        }
        return -1;
        
//          int i=2;
        // while(true){
        //     if(i%n==0 && i%2 ==0){
        //         break;
        //     }
        //     i++;
        // }
        // return i;
        
    }
}