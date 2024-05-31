class Solution {
    public int countSegments(String s) {
//          if(s.isEmpty()){
//             return 0;
//         }
        
//         String t=s.trim();
       
        
//          String ans="";
//       for(int i=0;i<t.length();i++){
//           if(t.charAt(i)==' '&& t.charAt(i+1)==' '){
//               continue;
//           }
//           ans =ans+t.charAt(i);
//       }
        
        
//         String ch[]=ans.split(" ");
//        // if(ch.length<=1){
//        //     return 0;
//        // }
//         return ch.length;
        
        //2nd
        
         int res=0;
    for(int i=0; i<s.length(); i++)
        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
            res++;        
    return res;

    }
}