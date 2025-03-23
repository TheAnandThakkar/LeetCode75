import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list = new ArrayList<>();
        int greatest = Arrays.stream(candies).max().orElse(0);
        Arrays.stream(candies).forEach((e) -> list.add(e + extraCandies >= greatest));
        return list;
    }
}
