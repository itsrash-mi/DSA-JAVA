class Solution {
    public int countHillValley(int[] nums) {
        int max=0;
        int i=1;
        int j=0;
        int n=nums.length;
        for(i=1;i<n-1;i++)
        {
            if((nums[j]<nums[i] && nums[i]>nums[i+1])   ||  (nums[j]>nums[i] && nums[i]<nums[i+1]))
            {
                max++;
                j=i;
            }
        }
        return max;
    }
}