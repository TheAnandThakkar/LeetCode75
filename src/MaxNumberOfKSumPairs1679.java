import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs1679 {
    public static void main(String[] args) {
        int[] nums = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        System.out.println(maxOperations(nums, 3));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;

        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}

/// alternate solution
 /* HashMap<Integer , Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = k - nums[i];

            if(hashMap.getOrDefault(complement , 0) > 0){
                count++;
                hashMap.put(complement, hashMap.get(complement) - 1);
            }else{
                hashMap.put(nums[i] , hashMap.getOrDefault(nums[i], 0) + 1);
            }
        }*/
