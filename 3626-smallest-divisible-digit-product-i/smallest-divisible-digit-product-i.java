class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<100;i++){
            int num = 1;
            if(i>0 && i<10){
                num = i;
            }
            else if(i>=10 && i<100){
                num = (i/10)*(i%10);
            }
            if(num%t==0){
                return i;
            }
        }
        return 100;  
    }
}