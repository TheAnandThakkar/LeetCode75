public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {

      char[] sChars = s.toCharArray();

      int startIndex = 0;
      int endIndex = sChars.length - 1;

      while(startIndex < endIndex){

          while (startIndex < endIndex && !isVowel(sChars[startIndex])){
              startIndex++;
          }

          while (startIndex < endIndex && !isVowel(sChars[endIndex])){
              endIndex--;
          }

          char temp = sChars[startIndex];
          sChars[startIndex] = sChars[endIndex];
          sChars[endIndex] = temp;

          startIndex++;
          endIndex--;
      }

        return new String(sChars);

    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
