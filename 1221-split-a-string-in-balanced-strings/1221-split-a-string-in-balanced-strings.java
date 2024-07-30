class Solution {
    public int balancedStringSplit(String s) {
        
         if (s == null || s.length() == 0)
            return 0;
        int left = 0, right = 0, score = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L')
                left++;
            else
                right++;
            if (left == right) 
                score++;
        }
        return score;
    }
}