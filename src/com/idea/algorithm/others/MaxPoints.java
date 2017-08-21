package com.idea.algorithm.others;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/4.
 */
public class MaxPoints {
    public static void main(String[] args) {
        Point[] points ={new Point(1, 2), new Point(3, 6), new Point(0,0), new Point(1,3)};
        System.out.println(maxPoints(points));



    }
    public static int maxPoints(Point[] points) {
        // Write your code here
        if(points.length <= 2) return points.length;
        int max = 2;
        for(int i = 0; i < points.length-1 ; i++){
            for(int j = i+1 ; j < points.length ; j++){
                int yValue = (points[j].y - points[i].y);
                yValue = yValue < 0 ? -yValue : yValue;
                int xValue = (points[j].x - points[i].x);
                xValue = xValue < 0 ? -xValue : xValue;
                int n = j+1;
                while(n < points.length){
                    int count = 2;
                    int fx;
                    if(yValue == 0 || xValue == 0){
                        fx = yValue;
                    }else {
                        fx = points[n].x * yValue / xValue;
                    }

                    if(fx == points[n].y){
                        count++;
                    }
                    if(count > max) max = count;
                    n++;
                }

            }
        }


        return max;


    }



      static class Point {
         int x;
         int y;
         Point() { x = 0; y = 0; }
         Point(int a, int b) { x = a; y = b; }
      }
}
