class Solution {
    public int pivotIndex(int[] nums) {
         int sum=0;
        for(int x:nums)
        {
            sum=sum+x;
        }
        int l=0;
        int r=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            r=sum-nums[i]-l;
            if(r==l)
            {
                return i;
            }
            l=l+nums[i];
        }
        return -1;
    }
}