class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       /* HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:nums1)
        {
            int count=h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        for(int x:nums2)
        {
            int count=h.getOrDefault(x,0);
            count++;
            h.put(x,count);   
        }
        for(int x:h.keySet())
        {
            if(h.get(x)==2) 
            {
                System.out.println(h.keySet());
            }
        }
        return new int[0];*/
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i:nums1)
        {   h1.add(i);  }
        for(int i:nums2)
        {   
            if(h1.contains(i))
            {
                h2.add(i);
            }
        }
        int[] dp=new int[h2.size()];
        int i=0;
        for(int j:h2)
        {   dp[i++]=j;  }
        return dp;
    }
}