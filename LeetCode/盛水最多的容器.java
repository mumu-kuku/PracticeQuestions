class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = (height[right] > height[left] ? height[right] : height[left]) *  (right - left);
        while (right > left) {
            if (height[left] >= height[right]) right--; else left++;
            int temp = (height[right] > height[left] ? height[right] : height[left]) *  (right - left);
            max = max >= temp ? max : temp;
        }
        
        return max;
    }
}