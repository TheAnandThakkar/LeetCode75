public class MaxConsecutiveOnesIII1004 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }

    public static int longestOnes(int[] nums, int k) {
        int rightBoundary = 0;
        int leftBoundary = 0;
        int zeroCount = 0;
        int maxLength = 0;

        while(rightBoundary < nums.length){

            if(nums[rightBoundary] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[leftBoundary] == 0){
                    zeroCount--;
                }
                leftBoundary++;
            }

            maxLength = Math.max(maxLength, rightBoundary - leftBoundary + 1);
            rightBoundary++;
        }
        return maxLength;
    }
}
