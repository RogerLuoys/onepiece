package com.luoys.onepiece;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sort {
    int[] OOO_ARRAY = {10, 1, 4, 7, 1, 21, 5, 83, 9, 8, 6, 4, 2, 12, 54, 68, 98, 45};
    LinkedList<Integer> OOO_LIST = new LinkedList<>(Arrays.asList(10, 1, 4, 7, 1, 21, 5, 83, 9, 8, 6, 4, 2, 12, 54, 68, 98, 45));

    @Test
    public void bubbleSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        bubbleSort(OOO_ARRAY);
        System.out.println(Arrays.toString(OOO_ARRAY));
        System.out.println(OOO_LIST.toString());
        bubbleSort(OOO_LIST);
        System.out.println(OOO_LIST.toString());
    }

    @Test
    public void quickSort() {
        System.out.println(OOO_LIST.toString());
        quickSort(OOO_LIST, 0, OOO_LIST.size() - 1);
        System.out.println(OOO_LIST.toString());
        System.out.println(Arrays.toString(OOO_ARRAY));
        quickSort(OOO_ARRAY, 0, OOO_ARRAY.length - 1);
        System.out.println(Arrays.toString(OOO_ARRAY));
    }


    //n-2 + n-3 + n-4 + ··· + 1 = (n-1)*(n-2)/2 = O(n^2)
    public void bubbleSort(int[] array) {
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    number = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = number;
                }
            }
        }
    }

    //n-2 + n-3 + n-4 + ··· + 1 = (n-1)*(n-2)/2 = O(n^2)
    public void bubbleSort(LinkedList<Integer> array) {
        int number;
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size() - i; j++) {
                if (array.get(j - 1) > array.get(j)) {
                    number = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, number);
                }
            }
        }
    }

    //1*n + 2*n + 3
    void quickSort(LinkedList<Integer> array, int l, int r) {
        if (l >= r) {
            return;
        } else if (l < r) {
            int i = l;
            int j = r;
            int x = array.get(l);
            while (i < j) {
                while (i < j && array.get(j) >= x) {
                    j--;
                }
                if (i < j) {
                    array.set(i, array.get(j));
                    i++;
                }
                while (i < j && array.get(i) < x) {
                    i++;
                }
                if (i < j) {
                    array.set(j, array.get(i));
                    j--;
                }
            }
            array.set(i, x);
            quickSort(array, l, i - 1);
            quickSort(array, i + 1, r);
        }
    }


    //快速排序
    void quickSort(int s[], int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) {
                    j--;
                }
                if (i < j) {
                    s[i] = s[j];
                    i++;
                }

                while (i < j && s[i] < x) {
                    i++;
                }
                if (i < j) {
                    s[j] = s[i];
                    j--;
                }
            }
            s[i] = x;
            quickSort(s, l, i - 1);
            quickSort(s, i + 1, r);
        }
    }
}
