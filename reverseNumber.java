package BASICMATHS;

public class reverseNumber{
    public static void reverse(int n){
        while(n>0){
            int reverse=n%10;
            System.out.print(reverse);
            n=n/10;
        }
    }public static void reverse2(int n){
        int rev=0;
        while (n>0) {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }System.out.println(rev);
    }
    public static void main(String[] args) {
        reverse2(5903);
    }
}
