class Solution {
    public void reverseString(char[] s) {
       
        String str = "";                   //Allocate extra space

        
        for(int i=s.length-1; i>=0; i--)   /*Add to extra space from rear to front */
            str += s[i];
        
        for(int i=0; i<s.length; i++)      /*Set reversed 'str' into char array 's' */
            s[i] = str.charAt(i);
    }
        
        

        
    
}
