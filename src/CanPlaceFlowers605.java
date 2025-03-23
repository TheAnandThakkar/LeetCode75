public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        int[] flowerBed = {1,0,0,0,1};
        int flower = 1;
        System.out.println(canPlaceFlowers(flowerBed, flower));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flower = 0;
        for(int i = 0 ; i < flowerbed.length ; i++){
            if(flowerbed[i] == 0){

                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    flower++;

                    if(flower >= n){
                        return true;
                    }
                }
            }
        }
        return flower >= n;
    }
}
