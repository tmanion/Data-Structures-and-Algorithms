package mySolutions.JavaScratches.Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void printArray(int[] array) {
        System.out.println("---Array---");
        Arrays.stream(array).forEach(System.out::println);
    }
    public static void moveZeros(int[] nums) {
        int index = 0;
        for(int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while(index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {0,1,0,3,12};
        moveZeros(nums1);
        printArray(nums1);

        int[] nums2 = new int[] {0};
        moveZeros(nums2);
        printArray(nums2);
    }
}
