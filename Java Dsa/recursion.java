public class recursion {

    public static void printNumber(int n){
        if(n <= 0) return;

        printNumber(--n);
        System.out.println(n+1);
        
    }

    public static int fact(int n){
        if(n <= 1) return 1;
        return n*fact(n-1);
    }

    public static void fib(int n, int a, int b){
        if(n < 1) return;
        System.out.print(a+b+" ");
        fib(--n, b, a+b);
    }

    public static void main(String[] args) {
        fib(20, -1, 1);
    }
}
