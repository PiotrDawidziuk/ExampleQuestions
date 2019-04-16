public class Factorial {


    public static int factorial(int n){

        if (n < 2) {
            return 1;
        }

        return n * (factorial(n-1));
    }
    public static void main(String[] args) {

        int i = 3;
        int j = factorial(i);
        System.out.println(i+"!"+" = "+j);

    }


}
