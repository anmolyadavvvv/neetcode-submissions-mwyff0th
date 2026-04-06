class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        StringBuilder sb = new StringBuilder(t);

        for (char c : s.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));

            if (index == -1) {
                return false;
            }

            sb.deleteCharAt(index);
        }

        return true;
    }
}