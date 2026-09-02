class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int n=0;
        int l=0;
        for(int i=s.length()-1; i>=0; i--)
        {
            int r=h.get(s.charAt(i));
            if(r<l)
            {
                n=n-r;
            }
            else
            {
                n=n+r;
            }
            l=r;
        }
        return n;
    }
}