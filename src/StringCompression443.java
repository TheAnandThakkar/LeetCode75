public class StringCompression443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        StringBuilder compressed = new StringBuilder();

        int i = 0;
        while(i < chars.length){
            char currentChar = chars[i];

            int count = 0;
            while(i < chars.length && chars[i] == currentChar){
                count++;
                i++;
            }

            compressed.append(currentChar);

            if(count > 1){
                compressed.append(count);
            }
        }

        System.out.println(compressed);

        for(int j = 0 ; j < compressed.length() ; j++){
            chars[j] = compressed.charAt(j);
        }

        return compressed.length();
    }
}
