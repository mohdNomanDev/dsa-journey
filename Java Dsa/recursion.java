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

        int half = power(m, n/2);

        if(n % 2 == 0){
            return half * half;
        }else{
            return half * half * m;
        }

    }

    public static String removeDuplicates(String str){
        StringBuilder stb = new StringBuilder("");
        boolean[] map = new boolean[26];
        removeDuplicates(str,0,stb,map);
        return stb.toString();
    }

    public static void removeDuplicates(String str, int idx, StringBuilder stb, boolean[] map) {
        if(idx >= str.length()) return;
        char ch = str.charAt(idx);
        if(!map['z' - ch]) {
            stb.append(ch);
            map['z' - ch] = true;
        }
        removeDuplicates(str,idx+1,stb,map);
    }


    public static int tiling(int n){
        if(n == 0 || n == 1) return 1;

        return tiling(n-1) + tiling(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("appnnacollege"));
    }
}
