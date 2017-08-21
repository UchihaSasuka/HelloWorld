package com.idea.algorithm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/7.
 */
public class Deap {

    public static void main(String[] args) {
        int[] array = {1,5,3,2,7,4,6};
        buildHeap(array);
        int len = array.length;
        for(int i = 0 ; i < len ; i++){
            int temp =array[0];
            downDeap(array,len-1-i, len-1-i);
            array [len-1-i] = temp;
        }
        System.out.println(1);
    }

    public static void downDeap(int[] array, int index, int len){
        int pos = 0;
        int child = 2*pos+1;
        int temp = array[index];
        for(; child <= len ; child = 2*child+1){
            if(child < len && array[child] > array[child+1]){
                child = child + 1;
            }
            if(temp > array[child]){
                array[pos] = array[child];
                pos = child;
            }
        }
        array[pos] = temp;

    }

    public List<Integer> medianSlidingWindow(int[] nums, int k) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        return list;
    }

    public static void buildHeap(int[] array){
        int len = array.length;
        int start = len/2 - 1;
        for(int i = start ; i >= 0; i--){
            int pos = 2*i + 1;
            if(pos + 1 < len && array[pos] > array[pos+1]){
                pos = pos + 1;
            }
            if(array[i] > array[pos]){
                int temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
            }
        }

    }

    public void heapSort(int[] array, int index, int len){

    }
}
