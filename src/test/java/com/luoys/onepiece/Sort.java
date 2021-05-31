package com.luoys.onepiece;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sort {
    int[] OOO_ARRAY = {10, 1, 4, 7, 1, 21, 5, 83, 9, 8, 6, 4, 2, 12, 54, 68, 98, 45};
    LinkedList<Integer> OOO_LIST = new LinkedList<>(Arrays.asList(10, 1, 4, 7, 1, 21, 5, 83, 9, 8, 6, 4, 2, 12, 54, 68, 98, 45));

    //冒泡排序
    @Test
    public void bubbleSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        bubbleSort(OOO_ARRAY);
        System.out.println(Arrays.toString(OOO_ARRAY));
        System.out.println(OOO_LIST.toString());
        bubbleSort(OOO_LIST);
        System.out.println(OOO_LIST.toString());
    }

    // 快速排序
    @Test
    public void quickSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        quickSort(OOO_ARRAY, 0, OOO_ARRAY.length - 1);
        System.out.println(Arrays.toString(OOO_ARRAY));
        System.out.println(OOO_LIST.toString());
        quickSort(OOO_LIST, 0, OOO_LIST.size() - 1);
        System.out.println(OOO_LIST.toString());
    }

    // 选择排序
    @Test
    public void selectSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        selectSort(OOO_ARRAY);
        System.out.println(Arrays.toString(OOO_ARRAY));
        System.out.println(OOO_LIST.toString());
        selectSort(OOO_LIST);
        System.out.println(OOO_LIST.toString());
    }

    // 插入排序
    @Test
    public void insertSort() {
        System.out.println(OOO_LIST.toString());
        insertSort(OOO_LIST);
        System.out.println(OOO_LIST.toString());
    }

    // 希尔排序
    @Test
    public void shellSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        shellSort(OOO_ARRAY);
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

    // n*(n-1)/2 = O{n^2)
    void selectSort(int[] array) {
        int min;
        int tmp;
        for(int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (i != min) {
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }

    void selectSort(LinkedList<Integer> array) {
        int min;
        int tmp;
        for (int i = 0; i < array.size(); i++) {
            min = i;
            for(int j = i + 1; j < array.size(); j++) {
                if (array.get(min) > array.get(j)) {
                    min = j;
                }
            }
            if (min != i) {
                tmp = array.get(i);
                array.set(i, array.get(min));
                array.set(min, tmp);
            }
        }
    }

    // O(n^2)
    void insertSort(LinkedList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.get(j) < array.get(j-1)) {
                    array.add(j-1, array.get(j));
                    array.remove(j+1);
                }
            }
        }
    }

    void shellSort(int[] array) {
        int tmp;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j >= gap; j -= gap) {
                    if (array[j] < array[j-gap]) {
                        tmp = array[j-gap];
                        array[j-gap] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
    }

    //O(log2^n) ~ O(n^2)
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
