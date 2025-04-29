class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        if (nums == null || nums.length == 0)
            return arr;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        if (l != nums.length && nums[l] == target)
           arr[0] = l;
        r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target)
                r = m - 1;
            else
                l = m + 1;
        }
        if (r != -1 && nums[r] == target)
            arr[1] = r;
        return arr;
    }
}