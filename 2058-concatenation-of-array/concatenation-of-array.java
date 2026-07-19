class Solution {
    public int[] getConcatenation(int[] nums) {
        int m=nums.length;
        int[] nums2=new int[nums.length];
        for(int i=0;i<m;i++)
        {
            nums2[i]=nums[i];
        }
        int n=nums2.length;
        int[] nums3=new int[m+n];
        int i=0;
        for(int x=0;x<m;x++)
        {
            nums3[i]=nums[x];
            i++;
        }
        for(int x=0;x<n;x++)
        {
            nums3[i]=nums2[x];
            i++;
        }
        return nums3;
    }
}