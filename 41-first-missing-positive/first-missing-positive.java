class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : nums)
        {
            h.put(i,1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!h.containsKey(i))
            {return i;}
        }
        return nums.length+1;
    }
}