public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length ; i++) {
           if(nums[i] != 0){
               nums[position] = nums[i];
               position++;
           }
        }

        for (int i = position; i < nums.length; i++) {
            nums[i] = 0;
        }

        for (Integer i: nums){
            System.out.println(i);
        }
    }
}
