import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            Set<Integer> s = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int t = -nums[i]-nums[j];
                if(s.contains(t)){
                    List<Integer> tp = Arrays.asList(nums[i],nums[j],t);
                    Collections.sort(tp);
                    res.add(tp);
                }
                s.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
