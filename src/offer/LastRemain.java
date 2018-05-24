package offer;

public class LastRemain {
    public static void main(String[] args){
        System.out.print(LastRemaining_Solution(7,3));
    }

    public static int LastRemaining_Solution(int n, int m) {

        if(n<=0||m<=0) {
            return -1;
        }

        int[] num = new int[n];
        int step=0;//标记新一轮数数，数到几
        int index = -1;//表示当前在数组的那个下标
        int count = n; //表示剩余数组长度
        while(count>0){
            index ++ ;
            if(index>=n){
                index = 0;
            }
            if(num[index]==-1){
                continue;
            }
            step ++ ;
            if(step==m){
                num[index] = -1;
                step = 0;
                count -- ;
            }
        }
        return index;
    }
}
