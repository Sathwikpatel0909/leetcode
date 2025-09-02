import java.util.*;
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lf=0, rt=arr.length - 1;
        while (rt-lf+1>k) {
            if (Math.abs(arr[lf]-x) >Math.abs(arr[rt]-x))lf++;
            else rt--;
        }
        List<Integer>ans=new ArrayList<>();
        for (int i=lf;i<=rt;i++)ans.add(arr[i]);
        return ans;
    }
}