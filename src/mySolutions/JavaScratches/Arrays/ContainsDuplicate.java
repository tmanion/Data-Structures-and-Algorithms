package mySolutions.JavaScratches.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], true);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,1};
        int[] nums2 = new int[] {1,2,3,4};
        int[] nums3 = new int[] {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums1));  
        System.out.println(containsDuplicate(nums2));  
        System.out.println(containsDuplicate(nums3));        
    }
    
}
