class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowstart=0;
        int windowend=0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxlen = Integer.MIN_VALUE;
        int len =0;
        while(windowend<n){
            char ch = s.charAt(windowend);
            if(set.contains(ch)){
                while(windowstart<windowend && set.contains(ch)){
                    set.remove(s.charAt(windowstart));
                    windowstart++;
                }

            }
            set.add(ch);
            maxlen= Math.max(maxlen, windowend-windowstart+1);
            windowend++;
        } 
        return (maxlen==Integer.MIN_VALUE)?0:maxlen;
    }
}