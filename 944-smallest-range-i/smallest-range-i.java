class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i:nums) 
        {
            if (min > i) 
            {min = i;}
            if (max < i) 
            {max = i;}
        }
        int ans=(max-k)-(min+k);
        if(ans>0)
        {return ans;}
        return 0;
    }
}