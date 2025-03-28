public class MaximumNumberOfVowelsInASubstringOfGivenLength1456 {
    public static void main(String[] args) {
        System.out.println(maxVowels("tryhard", 4));
    }

    public static int maxVowels(String s, int k) {
       int maxVowel = 0;
       int currentVowelCount = 0;

        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) currentVowelCount++;
        }
        maxVowel = currentVowelCount;

        for (int i = k ; i < s.length(); i++) {
            if(isVowel(s.charAt(i - k))) currentVowelCount--;
            if(isVowel(s.charAt(i))) currentVowelCount++;
            maxVowel = Math.max(maxVowel , currentVowelCount);
        }
        return maxVowel;
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
