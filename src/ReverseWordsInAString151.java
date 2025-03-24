import java.util.*;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        ArrayList<String> arrayList = new ArrayList<>(List.of(s.trim().split("\\s+")));
        Collections.reverse(arrayList);
        return String.join(" " , arrayList).trim();
    }
}
