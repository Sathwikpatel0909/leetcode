import java.util.*;
class Solution {
    public int numberOfSubarrays(int[] nms, int k) {
        int n = nms.length;
        int res = 0;
        int lft=0, ryt=0, oddCnt=0;
        int[]pre = new int[n+1];
        pre[0]=1;     
        for (int i=0;i<n;i++) {
            if (nms[i]%2==1)oddCnt++;
            if (oddCnt>=k)res+=pre[oddCnt-k];
            pre[oddCnt]++;
        }   
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nms={1, 1, 2, 1, 1};
        int k=3;
        System.out.println(sol.numberOfSubarrays(nms, k));
    }
}
