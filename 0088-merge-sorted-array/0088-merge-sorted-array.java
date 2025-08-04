class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ix1 = m - 1;
        int ix2 = n - 1;
        int mI = m + n - 1;

        while (ix1 >= 0 && ix2 >= 0) {
            if (nums1[ix1] > nums2[ix2]) {
                nums1[mI] = nums1[ix1];
                ix1--;
            } else {
                nums1[mI] = nums2[ix2];
                ix2--;
            }
            mI--;
        }

        while (ix2 >= 0) {
            nums1[mI] = nums2[ix2];
            ix2--;
            mI--;
        }
    }
}
