public class Main {

    public static void main(String[] args) {
       System.out.print(NumberOf1(9));

    }

    public static int NumberOf1(int n) {

        int count = 0;
        while(n!=0){
            n = (n -1)&n;
            count ++;
        }
        return count;
    }
}
