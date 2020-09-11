public class Trap {

    public int trap(int[] height) {
        int leftMaxHeight = 0, rightMaxHeight = 0;
        int left = 0, right = height.length - 1;
        int result = 0;
        while (left <= right) {
            if (leftMaxHeight < rightMaxHeight) {
                result += Math.max(0, leftMaxHeight - height[left]);
                leftMaxHeight = Math.max(leftMaxHeight, height[left++]);
            } else {
                result += Math.max(0, rightMaxHeight - height[right]);
                rightMaxHeight = Math.max(rightMaxHeight, height[right--]);
            }
        }
        return result;
    }

}
