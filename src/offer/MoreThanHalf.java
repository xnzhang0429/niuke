package offer;

import java.util.HashMap;

public class MoreThanHalf {

    public static void main(String[] args){
        int[] array = {};
        int[] array1 = {0};
        int[] array2 = {2,3,4,2,5,6,2,3,2,2,2};
        int[] array3 = {2,3,4};
        System.out.println(MoreThanHalfNum_Solution(array));
        System.out.println(MoreThanHalfNum_Solution(array1));
        System.out.println(MoreThanHalfNum_Solution(array2));
        System.out.println(MoreThanHalfNum_Solution(array3));
        String str = "abcxyzihj";
        int n = 3;
        System.out.println(str.substring(n,str.length())+str.substring(0,n));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {

        int len = array.length;//获取数组长度
        if(len>1){
            HashMap<Integer,Integer> ha = new HashMap<>();
            for(int i=0;i<len;i++){
                if(ha.containsKey(array[i])){
                    ha.put(array[i],ha.get(array[i])+1);
                }
               else{
                    ha.put(array[i],1);
                }
                if((ha.get(array[i]))>len/2){
                    return array[i];
                }
            }
        }
        return  0;
    }
}
