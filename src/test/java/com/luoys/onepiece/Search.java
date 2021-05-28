package com.luoys.onepiece;

import org.junit.Test;

public class Search {
    int[] OOO_ARRAY = {1, 1, 2, 4, 4, 5, 6, 7, 8, 9, 10, 12, 21, 45, 54, 68, 83, 98};

    @Test
    public void binarySearch() {
        int index = binarySearch(OOO_ARRAY, 12, 0, OOO_ARRAY.length - 1);
        System.out.println("index: " + index);
    }


    //查询目标数字在数组中的位置
    private int binarySearch(int[] array, int target, int start, int end) {
        if (start == end && array[start] == target) {
            return start;
        } else if ((start == end && array[start] != target) || start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, start, mid - 1);
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, end);
        }
        return -1;
    }
}
