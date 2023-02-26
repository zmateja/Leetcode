package TwoSum;

import java.util.Arrays;

public class BruteForceRunner {
    public static void main(String[] args) {
        TwoSumBruteForce test = new TwoSumBruteForce();
        int[] nums = {3,3};
        int target = 6;
        int[] solution = test.twoSum(nums,target);
        System.out.println(Arrays.toString(solution));
    }
}
