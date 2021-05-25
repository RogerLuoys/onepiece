package com.luoys.onepiece;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Sort {
    int[] OOO_ARRAY = {1,4,7,1,2,5,8,9,8,6,4,2,12,54,68,98,45};
    LinkedList<Integer> OOO_LIST = new LinkedList<>(Arrays.asList(1,4,7,1,2,5,8,9,8,6,4,2,12,54,68,98,45));

    @Test
    public void bubbleSort() {
        System.out.println(Arrays.toString(OOO_ARRAY));
        bubbleSort(OOO_ARRAY);
        System.out.println(Arrays.toString(OOO_ARRAY));
        System.out.println(OOO_LIST.toString());
        bubbleSort(OOO_LIST);
        System.out.println(OOO_LIST.toString());
    }


    public int[] quickSort(int[] number) {

//        quickSort(number, 0, number.length-1);
        return number;
    }

    //n-2 + n-3 + n-4 + ··· + 1 = (n-1)*(n-2)/2 = O(n^2)
    public void bubbleSort(int[] array) {
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j]) {
                    number = array[j-1];
                    array[j-1] = array[j];
                    array[j] = number;
                }
            }
        }
    }

    public void bubbleSort(LinkedList<Integer> array) {
        int number;
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size() - i; j++) {
                if (array.get(j-1) > array.get(j)) {
                    number = array.get(j-1);
                    array.set(j-1, array.get(j));
                    array.set(j, number);
                }
            }
        }
    }

    void quickSort(LinkedList<Integer> s, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int x = s.get(l);
            for (;i < j; i++) {
                if (s.get(i) < x) {
                    s.set(i, s.get(i));
                }
            }
        }
    }


    //快速排序
    void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}
