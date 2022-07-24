class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        int res  =0;
        for(String s:words1)
            //count frequency of words in words1
            map.merge(s,1,Integer::sum);
        for(String s:words2)
            if(map.getOrDefault(s,0)<2)
                map.merge(s, -1, Integer::sum);
        for(int v:map.values())
            if(v==0)
                res++;
        return res;
    }
}