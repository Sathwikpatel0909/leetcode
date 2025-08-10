class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ans += c;
            }
        }
        String rev = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            rev += ans.charAt(i);
        }
        return ans.equals(rev);
    }
}
