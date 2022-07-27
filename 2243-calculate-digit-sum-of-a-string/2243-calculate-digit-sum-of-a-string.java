class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String groups = "";
            int sum = 0;
             int counter = k;
            for(int i=0; i <= s.length(); i++){
                if(i==counter) {
                    counter = (counter + k) < s.length() ? counter + k : s.length();
                    groups += sum;
                    sum = 0;
                    if(i == s.length()) {
                        break;
                        
                    }
                }
                sum += s.charAt(i) - '0';
                    
            }
            s = groups;
        }
        return s;
        
        
        
    }
}