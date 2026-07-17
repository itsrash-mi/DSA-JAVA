class Solution {
    public boolean isUgly(int n) {
       int[] dp={2,3,5};
        if(n<=0)
        {return false;}
        for(int x:dp)
        {
            while(n%x==0)
            {
                n=n/x;
            }
        }
        if(n!=1)
        {return false;}
        return true; 
    }
}