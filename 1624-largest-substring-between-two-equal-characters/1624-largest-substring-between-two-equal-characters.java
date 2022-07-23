class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++)
            if(i!= s.lastIndexOf(s.charAt(i)))
                ans = Math.max(ans,s.lastIndexOf(s.charAt(i))-i);
        return ans-1;
        
    }
}