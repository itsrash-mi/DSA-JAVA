class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        int avg=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            int copy=nums[i];
            if(copy%2==0 && copy%3==0)
            {
                sum=sum+copy;
                count++;
            }
        }
        if(count!=0)
        {avg=sum/count;}
        return avg;
    }
}