class Solution {
    public boolean isAnagram(String s, String t) {
        char[] intS = s.toCharArray();
        char[] intT = t.toCharArray();

        Arrays.sort(intS);
        Arrays.sort(intT);
        if(Arrays.equals(intS, intT)){
            return true;
        }
        return false;
    }
}
