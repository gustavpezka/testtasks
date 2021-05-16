package leetcode;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {21,45,97,128,9};
        int sum = 54;
        twoSums(nums,sum);
    }

    public static void twoSums(int[] nums, int target) {
        boolean answerable = false;
        for (int i = 0; i < nums.length; i++) {
            if (answerable) break;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    int[] answer = new int[]{i, j};
                    System.out.println("[" + answer[0] + "," + answer[1]+ "]");
                    answerable = true;
                    break;
                }
            }
        }
    }
}
