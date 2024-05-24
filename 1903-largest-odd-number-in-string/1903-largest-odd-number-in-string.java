class Solution {
    public String largestOddNumber(String num) {
        
        int l=num.length()-1;
        
        while(l>=0){
            
            int d=(int)num.charAt(l);
            if(d%2!=0){
                return num.substring(0,l+1);
            }
            l--;
            }
        return "";
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         String s="";
//         int sum=0;
        
        
//          for(int i=0;i<num.length();i++){
//             sum=num.charAt(i);
            
//          }
//         if(sum%2!=0){
//                 return num;
//             }
//         else{
            
        
            
        
//         for(int i=0;i<num.length();i++){
           
            
            
//             if(num.charAt(i)%2!=0){
//                 s+=num.charAt(i);
                
//             }
//         }
//         }
//         return s;
        
        
    }
}