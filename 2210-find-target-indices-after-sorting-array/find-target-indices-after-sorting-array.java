class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            Arrays.sort(nums);
        }
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}