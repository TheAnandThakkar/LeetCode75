import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for (Integer i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> hashSet = new HashSet<>(hashMap.values());
        return hashMap.size() == hashSet.size();
    }
}
