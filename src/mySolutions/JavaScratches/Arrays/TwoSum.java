package mySolutions.JavaScratches.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *  You can return the answer in any order.
 */
public class TwoSum {

    public static void printResult(int[] nums) {
        System.out.println("-Result-");
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static int[] bruteForce(int[] nums, int target) {  
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i +1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
           numMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            } 
        }


        return new int[] {-1, -1};
    }


    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int[] nums2 = new int[] {3, 2, 4};
        int[] nums3 = new int[] {3, 3};
       
        System.out.println("Brute Force");
        printResult( bruteForce(nums, 9) );
        printResult( bruteForce(nums2, 6) );
        printResult( bruteForce(nums3, 6) );

        System.out.println("Solution 2");
        printResult( solution2(nums, 9) );
        printResult( solution2(nums2, 6) );
        printResult( solution2(nums3, 6) );


    }
    
}

