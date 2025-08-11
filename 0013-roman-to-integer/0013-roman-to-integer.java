class Solution {
    public int romanToInt(String s) {
        int ans = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = "IVXLCDM".indexOf(s.charAt(i));
            int[] nums = {1,5,10,50,100,500,1000};
            int curr = nums[val];
            if (curr < prev) ans -= curr;
            else ans += curr;
            prev = curr;
        }
        return ans;
    }
}
