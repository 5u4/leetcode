package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (complements.containsKey(num)) {
                return new int[]{complements.get(num), i};
            }

            complements.put(target - num, i);
        }

        return new int[]{};
    }
}
