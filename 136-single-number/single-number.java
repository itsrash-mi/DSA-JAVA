class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums)
        {
            int count=h.getOrDefault(i,0);
            count++;
            h.put(i,count);
        }
        for(int x:nums)
        {
            if(h.get(x)==1)
            {
                return x;
            }
        }
        return 0;
    }
}