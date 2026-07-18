class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int j=1;j<=nums.length-1;j++)
        {
            min=Math.min(min,nums[j]);
            max=Math.max(max,nums[j]);
        }
        int gcd=0;
        for(int i=1;i<=max;i++)
        {
            if(min%i==0 && max%i==0)
            {gcd=i;}
        }
        return gcd;
    }
}