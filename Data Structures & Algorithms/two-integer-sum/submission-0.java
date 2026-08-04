class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        // map.put(nums[0],0);
        for(int i =0;i<nums.length;i++){
            int first = nums[i];
            int find = target - first;
                if(map.containsKey(find)){
                    result[0] = map.get(find);
                    result[1] = i;
                    break;
                }
                    map.put(first,i);
                
            }
        
        return result;
    }
}
