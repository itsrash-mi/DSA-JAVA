class Solution {
    public double[] convertTemperature(double celsius) {
        double[] dp=new double[2];
        dp[0]=celsius+273.15;
        dp[1]=celsius*1.80+32;
        return dp;
    }
}