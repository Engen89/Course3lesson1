package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc"};
        ArrayList<String> one = arrayToList(arr);
        System.out.println(one);
    }

    private static ArrayList<String> arrayToList(String[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void swapOne(Object[] arr, int index1, int index2) {
        Object obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

    public static <T> void swapTwo(T[] arr, int index1, int index2) {
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
}
