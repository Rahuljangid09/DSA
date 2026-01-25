import java.util.Scanner;

public class program1 {

    public static void reverseArray(int arr[]) {
        System.out.println();
        // for(int i=0; i<(arr.length-1)/2; i++){
        // int temp = arr[i];
        // arr[i]=arr[arr.length-i-1];
        // arr[arr.length-i-1]=temp;
        // }

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
    }
}
