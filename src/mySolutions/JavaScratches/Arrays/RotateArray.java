package mySolutions.JavaScratches.Arrays;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if ( k < 0 ) {
            k = nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse( nums, nums.length - k, nums.length - 1);
        reverse( nums, 0, nums.length -1);
    }

    private static void reverse(int[] nums, int i, int j) {
        int leftIndex = i;
        int rightIndex = j;

        while ( leftIndex < rightIndex )  {
            int temp = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }

    public static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,4,5,6,7};
        int steps = 3;
        System.out.println("-Before-");
        printArray(nums1);
        rotate(nums1, steps);
        System.out.println("-Rotated-");
        printArray(nums1);


        int[] nums2 = new int[] {-1,-100,3,99};
        steps = 2;
       System.out.println("-Before-");
        printArray(nums2);
        rotate(nums2, steps);
        System.out.println("-Rotated-");
        printArray(nums2);
    }
}
