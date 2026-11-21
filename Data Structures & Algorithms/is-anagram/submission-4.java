class Solution {
    public boolean isAnagram(String s, String t) {
                if(s.length() != t.length()){
            return false;
        }
        char[] sCh = s.toCharArray();
        char tCh[] = t.toCharArray();
        Arrays.sort(sCh);
        Arrays.sort(tCh);

        for(int i=0;i<s.length();i++){
            if((sCh[i] - 'a') != (tCh[i] - 'a')){
                return false;
            }
        }
        return true;
    }
}
