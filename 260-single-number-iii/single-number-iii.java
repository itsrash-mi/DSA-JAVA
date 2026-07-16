class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:nums)
        {
            int count = h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        int[] dp=new int [2];
        int i=0;
        for(int y : h.keySet())
        {
            if(h.get(y)==1)
            {
                dp[i]=y;
                i++;
            }
        }
        return dp;
    }
}