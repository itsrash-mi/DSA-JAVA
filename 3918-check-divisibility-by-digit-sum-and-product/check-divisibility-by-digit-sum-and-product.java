class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int s=0;
        int p=1;
        while(n>0)
        {
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        if(temp%(s+p)==0)
        {
            return true;
        }
        return false;
    }
}