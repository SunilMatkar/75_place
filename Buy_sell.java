package Java.Array;

public class Buy_sell {

    public static int profitMax(int p[]){

        int buy  = Integer.MAX_VALUE;
        int profit2 = 0;

        for (int i = 0; i < p.length; i++) {
            if (buy < p[i]){
                int profit = p[i] - buy;
                profit2 = Math.max(profit2, profit); 
            }
            else{
                buy = p[i];
            }

        }
        return profit2;
    }
    public static void main(String[] args) {
        int p[] = {1,2,3,5,6,8,9,69,5,5,8,5};
        System.out.println(profitMax(p));
    }
}
