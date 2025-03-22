public class MergeStringAlternately1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab" , "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i < word1.length() && j < word2.length()){
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i < word1.length()){
            stringBuilder.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()){
            stringBuilder.append(word2.charAt(j));
            j++;
        }

        return stringBuilder.toString();
    }
}