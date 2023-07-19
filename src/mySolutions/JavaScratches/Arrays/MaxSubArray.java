package mySolutions.JavaScratches.Arrays;

public class MaxSubArray {
      public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : nums) {
            sum += i;
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = new int[] {1};
        int[] nums3 = new int[] {5,4,-1,7,8};

        System.out.println("nums1: " + maxSubArray(nums));
        System.out.println("nums2: " + maxSubArray(nums2));
        System.out.println("nums3: " + maxSubArray(nums3));
    }
}
