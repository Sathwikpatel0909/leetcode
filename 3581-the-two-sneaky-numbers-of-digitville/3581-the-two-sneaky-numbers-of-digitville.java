import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> fq = new HashMap<>();
        int[] sol = new int[2];
        int idx = 0;

        for (int num : nums) {
            fq.put(num, fq.getOrDefault(num, 0) + 1);
            if (fq.get(num) == 2) {
                sol[idx++] = num;
            }
        }

        return sol;
    }
}
