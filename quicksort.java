package com.company;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
       int [] ar={ 45,23,98,55,34,2,48,12};
       sort(ar,0, ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }

}
