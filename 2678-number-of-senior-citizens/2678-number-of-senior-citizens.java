class Solution {
    public int countSeniors(String[] details) {
        
//         int count=0;
//         for(int i=0;i<details.length;i++){
            
        
        
//         if(details[i].charAt(11)>6){
            
//             count++;
            
//         }
//     }
//         return count;
        
        //2nd
         int count=0;
        for(String s:details){
            int age=((s.charAt(11)-'0')*10)+s.charAt(12)-'0';
            if(age>60) count++;
        }
        return count;
        
    }
}