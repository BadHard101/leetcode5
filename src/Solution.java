class Solution {
    //         8 10     l 
    // sdrfaafsdfdsghbababghdsdfger
    //                    r  
    private int max;
    private String ans;
    private char[] chars;
    int n;

    private void findPalindromic(int l, int r, String s) {
        //    l
        // abcc
        //    r
        while (l >= 0 && r < n && chars[l] == chars[r]) {
            l--;
            r++;
        }
        l++;
        r--;

        if (r - l + 1 > max) {
            max = r - l + 1;
            ans = s.substring(l, r + 1);
        }
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        chars = s.toCharArray();
        n = chars.length;
        max = 1;
        ans = Character.toString(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            findPalindromic(i, i+1, s);
            findPalindromic(i-1,i+1, s);
        }
        return ans;
    }
}