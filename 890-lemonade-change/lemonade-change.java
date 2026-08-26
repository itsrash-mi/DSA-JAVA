class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean ans=true;
        int cf=0;
        int ct=0;
        for(int x=0;x<bills.length;x++)
        {
            int temp=bills[x];
            if(temp==5)
            {cf++;}
            else if(temp==10)
            {
                ct++;
                if(cf>0)
                {cf--;}
                else
                {ans= false;}
            }
            else
            {
                if(ct>0)
                {
                    ct--;
                    if(cf>0)
                    {cf--;}
                    else
                    {ans= false;}
                }
                else if(ct==0)
                {
                    if(cf<3)
                    {ans= false;}
                    cf-=3;
                }
            }
        }
        return ans;
    }
}