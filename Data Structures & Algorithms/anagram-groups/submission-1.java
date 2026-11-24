class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String chs= new String(ch);
            map.putIfAbsent(chs,new ArrayList<>());
            map.get(chs).add(strs[i]); 
        }
        return new ArrayList<>(map.values());
    }
}
