class Solution {
    public int strStr(String haystack, String needle) {
        int h_len = haystack.length();
        int n_len = needle.length();
        if (n_len == 0)
            return -1;
        else {
            for (int i = 0; i < h_len; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    int j = 1;
                    for (j = 1; j < n_len && j+i < h_len; j++) {
                        if (haystack.charAt(j+i) != needle.charAt(j)) {
                            break;
                        }
                    }
                    if (j == n_len) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}