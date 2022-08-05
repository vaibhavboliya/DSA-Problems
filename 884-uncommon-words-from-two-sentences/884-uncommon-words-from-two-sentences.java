class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         Map<String, Integer> map = new HashMap<>();
		// put every char with it frequency in the map
        for(String w:(s1+" "+s2).split(" "))
            map.put(w,map.getOrDefault(w,0)+1);
        ArrayList<String> res = new ArrayList<>();
        for(String w : map.keySet())
            if(map.get(w) ==1)
                res.add(w);
        return res.toArray(new String[0]);
            

    }
}