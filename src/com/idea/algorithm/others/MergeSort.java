package com.idea.algorithm.others;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/3.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array ={4,3,2,1};
        int count =merge(array,0,array.length-1);
        System.out.println(count);

    }

    public static int merge(int[] array, int start, int end){

        if(start == end){
            return 0;
        }

        int[] temp = new int[array.length];
        int sum = 0;

        int mid = (start + end)/2;
        sum += merge(array, start, mid);
        sum += merge(array, mid+1, end);
        int leftPosition = start;
        int rightPosition = mid+1;
        int position = start;

        while(leftPosition < mid+1 && rightPosition <= end){
            if(array[leftPosition] < array[rightPosition]){
                temp[position++] = array[leftPosition++];
            }else{
                sum += rightPosition - position ;
                temp[position++] = array[rightPosition++];
            }
        }

        while(leftPosition < mid+1){
            temp[position++] = array[leftPosition++];
        }

        while(rightPosition <= end){
            temp[position++] = array[rightPosition++];
        }

        for(int i = start ; i <= end ; i++){
            array[i] = temp[i];
        }
        return sum;
    }

}
