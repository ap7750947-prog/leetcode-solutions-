class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int no=0;
        StringBuilder ans=new StringBuilder();
        if(sum>9*num){
            return "";
        }
        while(num!=0){
            int min=Math.min(sum,9);
            ans.append(min);
            sum=sum-min;
            num--;
        }
        return ans.toString();
    }
}