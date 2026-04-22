class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null || nums.length<2) return false;

        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}