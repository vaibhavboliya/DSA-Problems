class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> list = new ArrayList<>();
        int n = s.length()/k;
        for(int idx =0;idx< n*k-k+1;idx =idx+k ){
            String substr = s.substring(idx,idx+k);
                list.add(substr);  
        }
        if(s.length()%k !=0){
        String str  = s.substring(n*k,s.length());
        int extra_val = k - (s.length()%k);
        String extra = str+ (""+fill).repeat(extra_val);
        list.add(extra);
        }
        String[] res = new String[list.size()];
        res = list.toArray(res);
        return res;
            
        
    }
}