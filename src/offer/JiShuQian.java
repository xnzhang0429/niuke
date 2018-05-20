package offer;

public class JiShuQian {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        reOrderArray(arr);
       // int array = 0;
        for(int array:arr){
            System.out.print(array+"...");
        }
    }
    public static void reOrderArray(int [] array) {

        if(array.length<1){
            return;
        }

        boolean flag = true;
        for(int i=0;i<array.length&&flag;i++){
            flag = false;
                for(int j=array.length-1;j>i;j--){
                    if(array[j]%2!=0&&array[j-1]%2==0){
                        int t = array[j-1];
                        array[j-1] = array[j];
                        array[j] = t;
                        flag = true;
                    }
                }


        }
    }
}
