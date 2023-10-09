package Java.Array;

public class Reverse_array {
    public static void revrse(int arr[]){
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,6,2,3,6,3,6,3,8,88,8};
        revrse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
