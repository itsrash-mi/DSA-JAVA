class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:nums)
        {
            int count = h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        int ans=0;
        int i=0;
        for(int y : h.keySet())
        {
            if(h.get(y)==1)
            {
                ans=y;
                i++;
            }
        }
        return ans;
    }
}