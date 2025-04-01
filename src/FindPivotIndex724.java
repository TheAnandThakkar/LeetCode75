public class FindPivotIndex724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (Integer i: nums){
            totalSum = totalSum + i;
        }

        for (int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
