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

    public static int power(int m,int n){
        if(n == 1) return m;

        return power(m,n/2) * power(m, (n-n/2));
    }
    public static void main(String[] args) {
        System.out.println(power(3, 3));
    }
}
