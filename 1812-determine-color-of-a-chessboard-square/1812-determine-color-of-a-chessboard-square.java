class Solution {
    public boolean squareIsWhite(String coordinates) {

        int asci = (int) coordinates.charAt(0) -96;
        int num = (int) coordinates.charAt(1);
        System.out.println(asci);
        if(asci%2!= 0 && num %2 != 0)
            return false;
        else if(asci%2==0 && num%2==0)
            return false;
        else
        return true;
    }
}