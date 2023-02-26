package TwoSum;

import java.util.Arrays;

public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumMain test = new TwoSumMain();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solution = test.twoSum(nums,target);
        System.out.println(Arrays.toString(solution));
    }
}
