package TwoSum;

import java.util.HashMap;

public class TwoSumBetterSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer,Integer> Complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (Complements.containsKey(target - nums[i])) {
                sol[0] = Complements.get(target-nums[i]);
                sol[1] = i;
                return sol;
            }
            else {
                Complements.put(nums[i],i);
            }
        }
        return sol;
    }
}
