class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        map.put(' ', ' ');
        char orgnl = 'a'; 
        for(char c:key.toCharArray())
            if(!map.containsKey(c))
                map.put(c,orgnl++);       
        StringBuilder str = new StringBuilder();
        for(int i=0;i<message.length();i++){
            str.append(map.get(message.charAt(i)));
        }
        return str.toString();
    }
}



