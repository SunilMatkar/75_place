package Java.Array;

public class CallBy_ref {
    public static void updated(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;     
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,6,7};
        updated(arr);

        //print an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " +arr[i]);
        }
    }
}
