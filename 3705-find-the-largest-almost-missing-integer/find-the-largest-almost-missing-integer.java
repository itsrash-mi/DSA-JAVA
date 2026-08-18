class Solution {
    public int largestInteger(int[] nums, int k) {
        int s=-1;
        for(int x:nums)
        {
            int c=0;
            for(int i=0;i<=nums.length-k;i++)
            {
                for(int j=i;j<i+k;j++)
                {
                    if(nums[j]==x)
                    {
                        c++;
                        break;
                    }
                }
            }
            if(c==1)
            {
                s=Math.max(s,x);
            }
        }
        return s;
    }
}