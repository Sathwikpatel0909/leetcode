import java.util.*;
class Solution{
    public List<List<Integer>>subsets(int[] nums){
        List<List<Integer>>res=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }
    void backtrack(int i,int[]nums,List<Integer>temp,List<List<Integer>>res){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        backtrack(i+1,nums,temp,res);
        temp.remove(temp.size()-1);
        backtrack(i+1,nums,temp,res);
    }
    public static void main(String[]args){
        Solution s=new Solution();
        int[]nums={1,2,3};
        System.out.println(s.subsets(nums));
    }
}
