class Solution {
    //         8 10     l 
    // sdrfaafsdfdsghbababghdsdfger
    //                    r  
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        char[] chars = s.toCharArray();
        int n = chars.length();
        int max = 1;
        String ans = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == chars[i+1]) {
                int l = i;
                int r = i+1;
                //
            }
            else if (i != 0 && i != n-1) {
                int l = i - 1;
                int r = i + 1;
                while (l >= 0 && r < n && chars[l] == chars[r]) {
                    l--;
                    r++;
                }
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    ans = s.substring(l, r + 1);
                }
            }
        }
    }
}