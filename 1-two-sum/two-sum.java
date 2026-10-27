import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                    int[] arr = new int[list.size()];
                    for (int k = 0; k < list.size(); k++) {
                        arr[k] = list.get(k);
                    }
                    return arr;
                }
            }
        }
        return new int[]{};
    }
}