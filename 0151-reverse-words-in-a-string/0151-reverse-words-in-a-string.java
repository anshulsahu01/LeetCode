class Solution {
    public String reverseWords(String s) {
        
        
        //trim  
        
       String s1= s.trim();
               // String s1= s;

        
        String re="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '&& s1.charAt(i+1)==' '){
                continue;
            }
            else{
                re =re +s1.charAt(i);
            }
        }
        
        String sp[]=re.split(" ");
        
        
        int l=sp.length;
        String ans="";
        
        for(int i=0;i<l;i++){
            ans=sp[i]+ans;
            
        if(i==l-1 )
            continue;
            ans =" "+ans;
            
        }
        return ans;
        
    }
}