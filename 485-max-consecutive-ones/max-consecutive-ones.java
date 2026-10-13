class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int onecount = 0;
        int maxcount = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==1){
                onecount++;
                maxcount = Math.max(maxcount,onecount);
            }
            else{
                onecount = 0;
            }
                }
                return maxcount;

                }
            }
