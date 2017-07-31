package com.mofosys.project.locationdemo;

import java.util.Arrays;

/**
 * Created by girish on 28/7/17.
 */
// Java program to print frequencies of all array
// elements in O(1) extra space and O(n) time

class CountFrequencies {

    public static void main(String[] args) {

        int arr[] = {2, 3, 3, 2, 5, 2, 7, 7, 7, 7, 0, 0};
        int k = 0;
        int x = 0;

        Arrays.sort(arr);
        int lastValue = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (x <= lastValue) {
                for (int j = 0; j <= arr.length - 1; j++) {

                    if (x == arr[j]) {
                        k++;
                    }
                }
                System.out.println(x + " Occurrence " + k);
                k = 0;
                x++;
            }
        }
    }
}

