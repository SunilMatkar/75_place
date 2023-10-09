package Java.Array;

public class Trapping_Water {

    public static int trappingWater(int h[]){
        int n = h.length;

        //left max height
        int lm [] = new int [n];
        lm[0] = h[0];
        for (int i = 1; i < h.length; i++) {
            lm[i] = Math.max(h[i], lm[i - 1]);
        }


        //right max height
        int rm[] = new int[n];
        rm[n-1] = h[n -1];
        for (int i = n -2; i >+ 0; i--) {
            rm[i] = Math.max(h[i], rm[i+1]);
        }


        //loop
        int trap = 0;
        for (int i = 1; i < n; i++) {
            int waterLevel = Math.min(rm[i], lm[i]);
            trap += waterLevel- h[i] ;
        }
        //calculate trap water
        return trap;
    }
    public static void main(String[] args) {
         int h[] = {1,2,3,5,46,8,79,6,3,6,4};
         System.out.println(trappingWater(h));
    }
}
