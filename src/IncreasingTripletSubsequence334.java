public class IncreasingTripletSubsequence334 {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        boolean increasingTriplet = false;
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= firstNumber){
                firstNumber = nums[i];
            }else if(nums[i] <= secondNumber){
                secondNumber = nums[i];
            }else{
                increasingTriplet = true;
            }
        }
        return increasingTriplet;
    }
}
