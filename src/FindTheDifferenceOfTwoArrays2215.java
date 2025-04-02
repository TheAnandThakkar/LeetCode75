import java.util.*;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        for(Integer i : nums1) set1.add(i);

        HashSet<Integer> set2 = new HashSet<>();
        for(Integer i : nums2) set2.add(i);

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(Integer i : set1){
            if(!set2.contains(i)){
                arr1.add(i);
            }
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        for(Integer i : set2){
            if(!set1.contains(i)){
                arr2.add(i);
            }
        }

        return Arrays.asList(arr1, arr2);
    }
}
