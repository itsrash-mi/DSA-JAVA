class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");
        if (pattern.length() != a.length) 
        {return false;}
        HashMap<Character, String> h = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) 
        {
            char c = pattern.charAt(i);
            String b = a[i];
            if (h.containsKey(c)) {
                if (!h.get(c).equals(b)) 
                {return false;}
            } 
            else 
            {
                if (h.containsValue(b)) 
                {return false;}
                h.put(c, b);
            }
        }
        return true;
    }
}