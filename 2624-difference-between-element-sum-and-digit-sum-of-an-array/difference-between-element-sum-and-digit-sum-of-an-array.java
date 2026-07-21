class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            esum=esum+nums[i];
        }
        int dsum=0;        
        for(int i=0;i<=nums.length-1;i++)
        {
            while(nums[i]>0)
            {
                int r=nums[i]%10;
                dsum=dsum+r;
                nums[i]=nums[i]/10;
            }
        }
        int dif=esum-dsum;
        return dif;
    }
}