package BASICMATHS;

public class primeNumber {
    public static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }return count==2;
    }public static void main(String[] args) {
        System.out.println(prime(13));
    }
}
