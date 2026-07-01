class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] dp=new int[l];
        dp[0]=nums[0];
        for(int i=1;i<l;i++)
        {
            dp[i]=dp[i-1]+nums[i];
        }
        return dp;
    }
}