package com.heavymaverick;

import java.util.Arrays;
import java.util.HashMap;
import java.util.SortedMap;

public class TwoSum {
    static int[] nums = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4};
    static int target = 6;
    public static int[] getSolve(int[] nums, int target) {
        for (int i = 0; i < (nums.length - 1); i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] anotherOne(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSolve(nums, target)));
        System.out.println(Arrays.toString(anotherOne(nums, target)));
    }
}
