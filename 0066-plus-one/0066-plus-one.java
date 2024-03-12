class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            
            if(digits[i]==9){
                digits[i]=0; //130
                
            }else{
                digits[i]++;
                return digits; //124
            }
            
        }
        digits =new int[digits.length+1];//0000
            digits[0]=1; //1000
            return digits;
        
    }
}