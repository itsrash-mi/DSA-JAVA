class Solution {
    public String removeStars(String s) {
        char[] a=s.toCharArray();
        LinkedList<Character> l=new LinkedList<>();
        for(char x:a)
        {
            if(x=='*')
            {
                l.removeLast();
            }
            else
            {
                l.addLast(x);
            }
        }
        String ans="";
        for(char i:l)
        {
            ans=ans+i;
        }
        return ans;
    }
}