public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums , 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;

        for(int i = k ; i < nums.length ; i++){
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum / k;
    }
}
