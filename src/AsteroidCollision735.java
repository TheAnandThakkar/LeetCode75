import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision735 {
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(Integer integer : asteroids){

            boolean isCollide = true;

            while(!stack.isEmpty() && integer < 0 && stack.peek() > 0){
                int top = stack.peek();

                if(top < -integer){
                    stack.pop();
                    continue;
                }else if(top == -integer){
                    stack.pop();
                }

                isCollide = false;
                break;
            }

            if(isCollide){
                stack.push(integer);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
