class Solution {
    public int jump(int[] nums) {
        int n=nums.length-1;
        int jump=0;
        int curr_end=0;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, nums[i]+i);
        if(i==curr_end){
            jump++;
            curr_end=max;
        }
    }
    return jump;}
}
