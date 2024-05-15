class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=2*nums.length;
        
        //ye size hum ne isliye lagay hai quki humko ek arry chahiye double size ka
        int n=nums.length;
        
        int[] ans =new int[size];
        
        // ans ke first 3 index mai value put kr ray hai
        
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        //ans ke 3index ke baad value daal ray hai
        
        for(int i=0;i<n;i++){
            ans[i+n]=nums[i];
        }
        return ans;
        
        
    }
}