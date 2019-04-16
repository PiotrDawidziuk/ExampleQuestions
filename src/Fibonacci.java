public class Fibonacci {

    public static int fibonacci(int n){

        if (n < 2)
            return 1;
        return fibonacci(n-1) + (fibonacci(n-2));
    }

    public static double fibonacciNonRecursive(int n){
        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < n; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;
    }

    public static void main(String[] args) {

        int i = 5;
        int j = fibonacci(i);
        System.out.println("Fibonacci's number on position "+i+" = "+j);

        int a = 5;
        double b = fibonacciNonRecursive(a);
        System.out.println(b);

    }




}
