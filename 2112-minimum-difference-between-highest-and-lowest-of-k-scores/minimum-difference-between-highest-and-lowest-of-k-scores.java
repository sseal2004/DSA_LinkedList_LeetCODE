class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i,j;
        int n=nums.length;
        if(n==1)return 0;
        int min=Integer.MAX_VALUE;
        for(j=k-1,i=0;j<n;i++,j++){
            min=Math.min(min,nums[j]-nums[i]);
        }
        return min;
    }
}