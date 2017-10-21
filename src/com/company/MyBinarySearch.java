package com.company;

public class MyBinarySearch {

    public static int find(int toFind, int[] arr) {
        return find(toFind, arr, 0, arr.length - 1);
    }

    private static int find(int toFind, int[] arr, int startIndex, int endIndex) {
        if (endIndex < startIndex) {
            return -1;
        }

        if (endIndex - startIndex <= 1) {
            if (toFind == arr[startIndex]) {
                return startIndex;
            }
            if (toFind == arr[endIndex]) {
                return endIndex;
            }
            return -1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;

        int middleValue = arr[middle];

        if (toFind == middleValue) {
            return middle;
        }

        if (toFind < middleValue) {
            return find(toFind, arr, startIndex, middle);
        }

        return find(toFind, arr, middle, endIndex);
    }
}
