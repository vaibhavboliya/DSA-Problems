class Solution {
    public char repeatedCharacter(String s) {
        int alphabets[] = new int[26];
        for(int i = 0;i<s.length();i++){
            if(alphabets[s.charAt(i)-'a']==1)
                return s.charAt(i);
            alphabets[s.charAt(i)-'a']++;
            
        }
        return '0' ;
    }
}