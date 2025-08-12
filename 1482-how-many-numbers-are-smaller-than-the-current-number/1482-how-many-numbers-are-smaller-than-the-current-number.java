import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for (int v : nums) freq[v]++;
        int[] less = new int[101];
        int cum = 0;
        for (int i = 0; i <= 100; i++) {
            less[i] = cum;
            cum += freq[i];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) res[i] = less[nums[i]];
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] inp = {8,1,2,2,3};
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(inp)));
    }
}
