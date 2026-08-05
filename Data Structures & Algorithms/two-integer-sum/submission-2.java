class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int cal = 0;
        for (int i=0;i<nums.length;i++){
           cal = target - nums[i];

           if(map.containsKey(cal)){
            return new int[]{map.get(cal), i};
           }

           map.put(nums[i], i);
        }
        return new int[0];
    }
}
