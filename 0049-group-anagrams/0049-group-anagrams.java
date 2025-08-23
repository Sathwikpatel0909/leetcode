import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs));
    }
}
