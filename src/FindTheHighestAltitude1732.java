import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheHighestAltitude1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        ArrayList<Integer> altitudeList = new ArrayList<>(List.of(0 , gain[0]));
        Arrays.stream(gain).reduce((a , b) -> {
            int diff = b + a;
            altitudeList.add(diff);
            return diff;
        });
        return Collections.max(altitudeList);
    }
}
