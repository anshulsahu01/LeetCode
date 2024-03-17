class Solution {
    public boolean isAnagram(String s, String t) {
        
        int l1= s.length()-1;
        int l2= t.length()-1;
        
        if(l1!=l2){
            return false;
        }
        char tempArray[] = s.toCharArray();
        
        Arrays.sort(tempArray);
        
        char tempArray2[] = t.toCharArray();
        
        Arrays.sort(tempArray2);
        // int result=;
        
        
        
        for(int i=0;i<=l1;i++){
            
       
        if(tempArray[i]!=tempArray2[i]){
            return false;
        }
//         else {

//             return true;
//         }
        


        }return true ;
        
    } 
}