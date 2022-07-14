class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n!=0){
            for(int i = m,j=0;i<nums1.length;i++){
                nums1[i] = nums2[j];
                j++;
            }
            Arrays.sort(nums1);
        }
        
    }
}