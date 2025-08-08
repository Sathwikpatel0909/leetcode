class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){

            hs.add(nums[i]);
        }
            List<Integer> ls=new ArrayList<>(hs);

            Collections.sort(ls, Collections.reverseOrder());
            if(ls.size()>=3) return ls.get(2);
            return ls.get(0);
        }   
}