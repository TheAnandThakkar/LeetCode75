import java.util.Stack;

public class RemoveStartsFromAString2390 {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else {
                stack.push(s.toCharArray()[i]);
            }
        }

        StringBuilder finalString = new StringBuilder();
        for (Character character : stack) {
            finalString.append(character);
        }

        return finalString.toString();
    }
}
