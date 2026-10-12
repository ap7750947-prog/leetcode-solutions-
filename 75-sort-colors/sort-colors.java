class Solution {
    public void sortColors(int[] nums) {
        int m = nums.length;
        for(int i = 0;i<m;i++){
            for(int j = i+1;j<m;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                } 
            }
        }

        
    }
}