class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1idx = m-1,num2idx = n-1,currentidx =m+n-1;
        while(num1idx>=0 && num2idx>=0){
            nums1[currentidx--] = (nums1[num1idx]>nums2[num2idx]?nums1[num1idx--]:nums2[num2idx--]);
        }
        while(num2idx>=0){
            nums1[currentidx--] = nums2[num2idx--];
        }
    }
}