public class Main1 {
    public static void main(String[] args){
        System.out.print(Power(3,2));
    }

    public static double Power(double base, int exponent) {

        boolean flag = false;
        if(equal(base,0.0)&&exponent<0){
            return 0.0;
        }
        if(exponent<0){
            exponent = Math.abs(exponent);
            flag = true;
        }

        double result = powerWithExponent(base,exponent);

        if(flag==true)
            result = 1.0/result;

        return result;
    }

    public static double powerWithExponent(double base, int exponent){
        System.out.println("ex"+exponent);
        double result = 1.0;
        for(int i=0;i<exponent;i++){
            result = result * base;
            System.out.println(result);
        }
        return result;
    }

     public static boolean equal(double base, double num){
        if((base-num>-0.000001)&(base-num<0.000001))
            return true;
        else
            return false;
     }
}
