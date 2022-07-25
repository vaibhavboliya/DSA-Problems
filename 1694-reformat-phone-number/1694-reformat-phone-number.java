class Solution {
    public String reformatNumber(String number) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                int num = number.charAt(i) -'0';
                list.add(num);
            }
        
        }
        StringBuilder result = new StringBuilder();
        while(list.size()>4)
		result.append(list.poll()).append(list.poll()).append(list.poll()).append('-');
	if(list.size()==4) result.append(list.poll()).append(list.poll()).append('-');
	while(!list.isEmpty()) result.append(list.poll());
	return result.toString();
        
    }
}