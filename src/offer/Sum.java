package offer;

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args){

        int[][] num = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        ArrayList<Integer> arr = printMatrix(num);

       for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"...");
        }
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(matrix.length<=0||matrix[0].length<=0||matrix==null){
            return null;
        }
        if(matrix.length==1){
            for(int i=0;i<matrix[0].length;i++){
                arr.add(matrix[0][i]);
            }
            return arr;
        }
        if(matrix[0].length==1){
            for(int i=0;i<matrix.length;i++){
                arr.add(matrix[i][0]);
            }
            return arr;
        }
        int start = 0;
        int col = matrix[0].length-1;
        int row = matrix.length-1;
       // while(matrix.length > 2*start && matrix[0].length > 2*start){
        while(((row-start)!=0) && ((col-start)!=0)){
            arr = printMatrixNew(matrix, arr, start, row, col);
            start++;
            row = matrix.length - start - 1;
            col = matrix[0].length  - start - 1;
        }
        while(((row-start)==0) && ((col-start)==0)){
            arr = printMatrixNew(matrix, arr, start, row, col);
            start++;
        }
        return arr;
    }

    public static ArrayList<Integer>printMatrixNew(int[][] matrix, ArrayList<Integer> arr, int start, int endRow, int endCol){

        for(int i=start;i<=endCol;i++){//从左到右
            arr.add(matrix[start][i]);
        }
        if(endRow>start){//从上到下
            for(int i=start+1;i<=endRow;i++){
                arr.add(matrix[i][endRow]);
            }
        }
        if(endCol>start&&endRow>start){//从右到左
            for(int i=endCol-1;i>=start;i--){
                arr.add(matrix[endRow][i]);
            }
        }
        if(endCol>start&&endRow>start+1){
            for(int i=endRow-1;i>=start+1;i--){
                arr.add(matrix[i][start]);
            }
        }

        return arr;
    }
}
