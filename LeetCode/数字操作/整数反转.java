package 数字操作;

class 整数反转 {
    public int reverse(int x) {
        int res = 0;
        int tmp = 0;
        int pre = 0;
        while (x != 0) {
            tmp = x % 10;
            res = res * 10 + tmp;
            if (res/10 != pre)
                return 0;
            x /= 10;
            pre = res;
        }

        return res;
    }
}


