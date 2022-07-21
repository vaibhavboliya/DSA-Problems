class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder s = new StringBuilder();
            s.append(words[i]);
            s.reverse();
            if(words[i].equals(s.toString()))
                return words[i];
        }
        return "" ;
        
    }
}