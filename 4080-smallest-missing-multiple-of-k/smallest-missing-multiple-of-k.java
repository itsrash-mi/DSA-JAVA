class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums)
        {
            h.add(x);
        }
        int temp=k;
        while(h.contains(temp))
        {
            temp+=k;
        }
        return temp;
    }
}