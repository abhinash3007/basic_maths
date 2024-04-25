package BASICMATHS;

public class amstrongNumber {
    public static boolean amstrong(int n) {
        return n==number(n);
    }public static int totalDigit(int n){
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
        }return count;
    }public static int number(int n){
        int val=0;
        int numD=totalDigit(n);
        while (n!=0) {
            int digit=n%10;
            val=(int) (Math.pow(digit, numD)+val);
            n=n/10;
        }return val;
    }
    public static void main(String[] args) {
        System.out.println(amstrong(371));
    }
}
