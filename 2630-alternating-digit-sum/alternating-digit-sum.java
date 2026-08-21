class Solution {
    public int alternateDigitSum(int n) {
        int pv=0, nv=0, l=0;
        while( n!=0)
        { 
            if(l%2==0)
            {   pv+=n%10; }
            else
            {   nv+=n%10; }
            n=n/10;
            l++;
        }
        if(l%2==0)
        {
            return nv-pv;
        }
        return pv-nv;
    }
}