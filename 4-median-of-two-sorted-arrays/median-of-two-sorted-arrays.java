class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        int i=0;
        for(int x=0;x<m;x++)
        {
            nums3[i]=nums1[x];
            i++;
        }
        for(int x=0;x<n;x++)
        {
            nums3[i]=nums2[x];
            i++;
        }
        Arrays.sort(nums3);
        i=0;
        int j=nums3.length-1;
        while(i<j)
        {
            i++;
            j--;
        }
        if(i==j)
        {
            return nums3[i];
        }
        else
        {
            double ans=1.0*(nums3[i]+nums3[j])/2;
            return ans;
        }
    }
}