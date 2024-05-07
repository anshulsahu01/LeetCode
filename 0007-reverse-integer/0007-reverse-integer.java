// class Solution {
//     public int reverse(int x) {
//         int rev=0;
//         if(x  1534236469){
//             return 0;
//         }
//         while(x!=0){
//             rev =rev*10+x%10;
//             x=x/10;
            
            
//         }return rev;
        
//     }
// }

// 2nd way

class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}
