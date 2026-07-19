class Solution {
    public int minOperations(int[] nums, int k) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<=dp.length-1;i++)
        {
            dp[i]=dp[i-1]+nums[i];
        }
        int sum=dp[dp.length-1];
        int ans=sum%k;
        return ans;
    }
}