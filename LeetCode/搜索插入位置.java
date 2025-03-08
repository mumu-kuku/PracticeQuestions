package m3.d9;

public class 搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = right/2;
        while (right >= left) {
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid = left + (right - left)/2;
        }

        return mid;
    }
}
