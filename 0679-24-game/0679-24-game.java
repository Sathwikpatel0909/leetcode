import java.util.*;
class Solution{
    public boolean judgePoint24(int[]cards) {
        double[]arr=new double[4];
        for (int i=0;i<4;i++)arr[i]=cards[i];
        return backtrack(arr,4);
    }
    boolean backtrack(double[] nums, int n) {
        if(n==1){
            return Math.abs(nums[0]-24)<1e-6;
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                double[] nxt=new double[n-1];
                int idx=0;
                for(int k=0;k<n;k++) {
                    if (k!=i && k!=j) nxt[idx++] = nums[k];
                }
                double[] t=ops(nums[i], nums[j]);
                for (int p=0;p<t.length;p++) {
                    nxt[idx]=t[p];
                    if (backtrack(nxt,n-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    double[] ops(double a, double b) {
        double[] tmp=new double[6];
        int idx=0;
        tmp[idx++]=a+b;
        tmp[idx++]=a-b;
        tmp[idx++]=b-a;
        tmp[idx++]=a*b;
        if (Math.abs(b)>1e-6)tmp[idx++]=a/b;
        if (Math.abs(a)>1e-6)tmp[idx++]=b/a;
        return Arrays.copyOf(tmp, idx);
    }
}
