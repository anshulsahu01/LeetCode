class Solution {
    public boolean detectCapitalUse(String word) {
//            if (word.length() < 2) return true;
        
//         String ans1=word.toUpperCase();
//         String ans2=word.toLowerCase();
//         String ans3="";
//           // if(word.charAt(0)>'a' || word.charAt(0)<'z'){
//           //     ans3 =(char)(word.charAt(0))-32;
//           // }
        
//         char aChar = word.charAt(0);
//                 if (65 <= aChar && aChar<=90){
//                     aChar = (char)( (aChar + 32) ); 
//                 }
//         ans3=aChar;
//         for(int i=1;i<word.length();i++){
//           ans3 =ans3 + word.charAt(i);
//         }
        
//         if(word ==ans1 ||word ==ans2 ||word ==ans3){
//             return true;
//         }
//         return false;
        
        
        
         return word.equals(word.toUpperCase()) || 
               word.equals(word.toLowerCase()) ||
               Character.isUpperCase(word.charAt(0)) && 
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
}