import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EqualRowAndColumnPairs2352 {
    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            String key = Arrays.toString(grid[i]);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < grid.length; i++) {
            int[] columnArr = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                columnArr[j] = grid[j][i];
            }

            String columnKey = Arrays.toString(columnArr);
            count = count + hashMap.getOrDefault(columnKey, 0);
        }
      return count;
    }
}

/// another solution with transposing an array
/* while(index < grid.length){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            arrayList.add(grid[i][index]);
        }
        transposedArray.add(arrayList);
        index++;
    }

        for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < transposedArray.size(); j++) {
            if(Arrays.toString(grid[i]).equals(transposedArray.get(j).toString())){
                count++;
            }
        }
    }*/



