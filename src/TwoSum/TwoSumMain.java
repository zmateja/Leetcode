package TwoSum;

import java.util.Arrays;

public class TwoSumMain {
    public static void main(String[] args) {
        TwoSumSolution test = new TwoSumSolution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solution = test.twoSum(nums,target);
        System.out.println(Arrays.toString(solution));
    }
}
