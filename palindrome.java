package BASICMATHS;

public class palindrome {
    public static boolean palin(int n){
        return n==rev(n);    
    }public static int rev(int n){
        int r=0;
        while(n!=0){
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }return r;
    }public static void main(String[] args) {
        System.out.println(palin(113));
    }
}
