public class GreatestCommonDivisorOfString1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB" , "ABAB"));

    }

    public static String gcdOfStrings(String str1, String str2) {
        String answer = "";

        if(!str1.concat(str2).equals(str2.concat(str1))){
            return answer;
        }

        int gcd = gcd(str1.length() , str2.length());
        answer = str1.substring(0, gcd);

        return answer;
    }

    public static int gcd(int x , int y){
        int gcd = 1;
        for(int i = 1 ; i <= x && i <= y ; ++i){
            if(x % i == 0 && y % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }
}
