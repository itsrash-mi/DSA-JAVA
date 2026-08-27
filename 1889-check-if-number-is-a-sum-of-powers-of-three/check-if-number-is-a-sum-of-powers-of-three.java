class Solution {
    public boolean checkPowersOfThree(int n) {
        boolean ans=true;
        while(n>0)
        {
            if(n%3>1)
            {
                ans=false;
            }
            n=n/3;
        }
        return ans;
    }
}