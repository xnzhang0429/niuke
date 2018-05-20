import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNum {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int weiShu = Integer.parseInt(buf.readLine());
        print1ToMaxOfNDigits(weiShu);
    }

    public  static void print1ToMaxOfNDigits(int n) {
        if (n < 0) return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, -1);
    }

    private  static void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit + 1] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private  static void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0') index++;//不打印0，从1开始打印
        while (index < number.length) System.out.print(number[index++]);
        System.out.println();
    }

}
