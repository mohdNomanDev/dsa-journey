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

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
