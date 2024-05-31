class Solution {
    public String reverseVowels(String s) {
       int start=0;
        int end=s.length()-1;
        char ch[]=s.toCharArray();
                                
        while(start<end){
            if(!vowel(ch[start])){
                start++;
            }else if(!vowel(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                
                start++;
                end--;
            }
            

        }
        
        // String str2=String.copyValueof(ch);
        // return str2;
        String s2="";
        for(int i=0;i<ch.length;i++){
            s2=s2+ch[i];
        }
        return s2;
                                
    }  
         static boolean vowel( char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'||
                ch=='A'||ch=='E'||
                        ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }
            return false;

    }

}