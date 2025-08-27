class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x ^=nums[i];
        }
        int diff=x &- x;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & diff)==0){
                a ^= nums[i];
            }
            else{
                b ^= nums[i];
            }
        }
        return new int[]{a,b};        
    }
}