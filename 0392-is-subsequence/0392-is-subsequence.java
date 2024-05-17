class Solution {
    public boolean isSubsequence(String s, String t) {
        // int count=0;
        // int l=s.length();
        // for(int i=0;i<s.length();i++){
        //     for(int j=i+1;j<t.length();j++){
        //         if(s.charAt(i)==t.charAt(j)){
        //             count ++;
        //         }
        //     }
        // }
        // if(count==l){
        //     return true;
        // }
        // return false;
        
        
        //2nd way
        
//         int indexs=0;
//         int indext=0;
        
//         while(indext<t.length()){
//             if(t.charAt(indext)==s.charAt(indexs)){
//                 indexs++;
//                 if(indexs==s.length()){
//                     return true;
//                 }
//                 indext++;
//             }
//         }
//             return false;
        
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;


        
    }
}