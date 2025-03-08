package m3.d8;

public class 无重复字符的最长子串 {
    // 自己写的
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0 || n == 1)
            return n;
        int start = 0, end = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = start;
            int k = -1;
            // 检查当前字符是否在 [start, end] 范围内重复
            for (j = start; j < end; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    k = j;
                }
            }
            if (k == -1) {
                // 无重复字符，扩展窗口
                end = i + 1;
                count = Math.max(count, end - start);
            } else {
                // 有重复字符，移动 start 指针到重复字符的下一个位置
                start = k + 1;
                end = i + 1;
            }
        }
        return count;
    }

    // 其他人的题解，理解
//    public int lengthOfLongestSubstring(String s) {
//        //滑动窗口
//        char[] ss = s.toCharArray();
//        Set<Character> set = new HashSet<>();//去重
//        int res = 0;//结果
//        for(int left = 0, right = 0; right < s.length(); right++) {//每一轮右端点都扩一个。
//            char ch = ss[right];//right指向的元素，也是当前要考虑的元素
//            while(set.contains(ch)) {//set中有ch，则缩短左边界，同时从set集合出元素
//                set.remove(ss[left]);
//                left++;
//            }
//            set.add(ss[right]);//别忘。将当前元素加入。
//            res = Math.max(res, right - left + 1);//计算当前不重复子串的长度。
//        }
//        return res;
//    }
}
