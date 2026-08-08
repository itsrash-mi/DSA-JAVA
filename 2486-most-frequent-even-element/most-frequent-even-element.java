class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        int ans=-1;
        int count=0;
        int f=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                continue;
            }
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        for(int x:h.keySet()){
            count = h.get(x);
            if(count>f || (count ==f && x <ans)){
                f = count;
                ans = x;
            }
        }
        return ans;
    }
}