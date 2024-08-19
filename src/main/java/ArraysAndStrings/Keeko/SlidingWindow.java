package ArraysAndStrings.Keeko;

public class SlidingWindow {

    public double findMaxAverage(int[] nums, int k) {
        double curr = 0;

        for (int i = 0; i < k && i < nums.length; i++)
            curr += nums[i];

        double maxCurr = curr;

        for (int left = 0, right = k; right < nums.length; left++, right++) {
            curr -= nums[left];
            curr += nums[right];
            if(curr > maxCurr)
                maxCurr = curr;
        }

        return maxCurr / k;
    }

}
