class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
//         String ans="";
        
//         for(int i=0;i<words.size();i++){
//             ans=ans+words.get(i).charAt(0);
//         }
//         if(ans==s){
//             return true;
//         }
//         return false;
        // 2nd
        
         StringBuilder nm=new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            nm.append(words.get(i).charAt(0));
        }
        return nm.toString().equals(s);
        
    }
}