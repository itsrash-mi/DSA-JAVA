class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            int copy=nums[i];
            int count=0;
            while(copy>0)
            {
                int r=copy%10;
                count++;
                copy=copy/10;
            }
            if(count%2==0)
            {ans++;}
        }
        return ans;
    }
}