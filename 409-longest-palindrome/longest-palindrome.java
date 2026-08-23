class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        HashMap<Character,Integer> h=new HashMap<>();
        int ans=0;
        for(char c:s.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
            if(h.get(c)%2==1)
            {ans++;}
            else
            {ans--;}
        }
        if(ans>1)
            return n-ans+1;
        return n;
    }
}