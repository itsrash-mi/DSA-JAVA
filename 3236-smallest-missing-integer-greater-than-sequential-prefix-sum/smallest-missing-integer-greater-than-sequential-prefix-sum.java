class Solution {
    public int missingInteger(int[] nums) {
        int ans = nums[0];
        int l = nums.length;
        HashSet<Integer> h = new HashSet<>();
        for (int x : nums) 
        {
            h.add(x);
        }
        int count = 1;
        while (count < l && nums[count] == nums[count - 1] + 1) 
        {
            ans += nums[count];
            count++;
        }
        while (h.contains(ans)) 
        {
            ans++;
        }
        return ans;
    }
}