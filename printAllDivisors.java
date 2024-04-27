package BASICMATHS;

public class printAllDivisors {
    public static void divisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }public static void printALL(int n){
        for(int i=1;i<=(int)Math.sqrt(n);i++){
             if(n%i==0){
                 System.out.println(i);
                if((n/i)!=i){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void main(String[] args) {
     //   divisors(36);
        printALL(36);
    }
}
