package ArraysAndStrings.Keeko;

public class TwoPointers {

    public void reverseString(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public int[] sortedSquares(int[] nums) {
        int[] sortedSquaresArray = new int[nums.length];
        for (int left = 0, right = nums.length - 1, index = nums.length - 1; left <= right; index--) {
            int leftSquared = (int) Math.pow(nums[left], 2);
            int rightSquared = (int) Math.pow(nums[right], 2);

            if (leftSquared > rightSquared) {
                sortedSquaresArray[index] = leftSquared;
                left++;
            } else {
                sortedSquaresArray[index] = rightSquared;
                right--;
            }
        }
        return sortedSquaresArray;
    }
}