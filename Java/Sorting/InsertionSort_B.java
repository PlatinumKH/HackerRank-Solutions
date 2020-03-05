import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsetionSort_B {

    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < n; i++){
            int place = findPlace(i, arr);
            /*if (place != i){
                swap(place, i, arr);
            }*/
            printArray(arr);
        }
    }

    static int findPlace(int p, int[] arr){
        int j = p;
        int value = arr[p];
        while (j >= 1 && arr[j-1] > value) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = value;
        return j;
    }

    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[arr.length - 1]);
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
