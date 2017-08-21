package com.idea.algorithm.recall;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/18.
 */
 class NQueen {

    public boolean isValid(int[] cols, int column){
        for(int i = 0 ; i < cols.length ; i++){
            int col = cols[i];
            if(col == column){
                return false;
            }
            if(col + i == column + col){

            }
        }

        return false;
    }
}
