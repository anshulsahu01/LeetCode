class Solution {
    public boolean isPalindrome(String s) {
        
//         String rev="";
//          // String p=" ";
//              s= s.toLowerCase();
//         String rev1="";
        
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)>=65 && s.charAt(i)<=122){
//                 rev=rev+s.charAt(i);
//             }
//             else{
//                 continue;
//             }
//         }
        
                
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)>=65 && s.charAt(i)<=122){
//                 rev1=s.charAt(i)+rev1;
//             }
//             else{
//                 continue;
//             }
//         }
        
        
        
    
        // return (rev.equals(rev1));
        
        //2nd
        
              s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}