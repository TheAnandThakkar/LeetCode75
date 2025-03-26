public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc" , "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
       int sCharIndex = 0;
       int tCharIndex = 0;
       while(sCharIndex < s.length() && tCharIndex < t.length()){
           if(s.charAt(sCharIndex) == t.charAt(tCharIndex)){
               sCharIndex++;
           }
           tCharIndex++;
       }
       return sCharIndex == s.length();
    }
}
