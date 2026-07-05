class Solution {
    public boolean isHappy(int n) {
        while(n>5)
        {
            int sum=0;
            while(n>0)
            {
                int r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            n=sum;
        }
        if(n==2 || n==3 || n==4 || n==5 || n==6 || n==7 || n==8 || n==9)
        {
            return false;
        }
        return true;
    }
}