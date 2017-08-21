package com.idea.algorithm.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/8.
 */
public class heapTest2 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,7,2};
        medianSlidingWindow(nums, 1);
    }
    public static List<Integer> medianSlidingWindow(int[] nums, int k) {
        // write your code here
        //1.维护两个优先队列，一个最大堆,一个最小堆
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(k);
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(k, Collections.reverseOrder());
        //2.将窗口值小的一半放到最大堆,最大的一半放到最小堆(偶数时两个堆的大小相同,奇数时最大堆的大小比最小堆多一位)
        for(int i = 0; i < k ; i++){
            int num = nums[i];
            if(minQueue.size() == 0 ||num > minQueue.peek()){
                minQueue.add(num);
            }else {
                maxQueue.add(num);
            }
        }
        while(maxQueue.size() > minQueue.size() + 1){
            minQueue.add(maxQueue.remove());
        }
        while(maxQueue.size() < minQueue.size()){
            maxQueue.add(minQueue.remove());
        }
        List<Integer> list = new ArrayList<>();

        //输出拿出最大堆的堆顶值,并将下一个值与最小堆的堆顶值进行比较,如果大则直接将当前值最大堆,如果小则将当前值放入最小堆,把最小堆的值放入最大堆
        for(int i = k-1 ; i < nums.length-1 ; i++){
            //获取到当前的中值
            list.add(maxQueue.peek());
            //数组向后移动之前先移除之前的一个元素
            int beforeNum = nums[i - k + 1];  //获取位置
            if(beforeNum <= maxQueue.peek()){
                maxQueue.remove(beforeNum);
            }else {
                minQueue.remove(beforeNum);
            }
            //添加下一个
            if(minQueue.isEmpty()){
                if(minQueue.isEmpty()){
                    minQueue.add(nums[i + 1]);
                }else {
                    maxQueue.add(nums[i + 1]);
                }
            }else{
                int value = minQueue.peek();
                if(value < nums[i + 1]){
                    if(maxQueue.size() > minQueue.size() + 1){
                        minQueue.add(nums[i + 1]);
                    }else if(maxQueue.size() == minQueue.size() + 1){
                        maxQueue.add(value);
                        minQueue.remove(value);
                        minQueue.add(nums[i + 1]);
                    }else {
                        maxQueue.add(nums[i + 1]);
                    }
                }else {

                }
            }



        }
        return list;
    }
}
