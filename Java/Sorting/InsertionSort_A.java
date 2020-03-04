
/* https://www.hackerrank.com/challenges/insertionsort1/problem */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class insertionSort1 {

    static void insertionSort1(int n, int[] arr) {

        int unsortedNum = arr[n - 1];

        for (int i = n - 2; i >= 0; i--){
            if (unsortedNum < arr[i]){
                arr[i + 1] = arr[i];
                printArray(arr);
                arr[i] = unsortedNum;
            } else break;
        }
        printArray(arr);
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

        insertionSort1(n, arr);

        scanner.close();
    }
}
