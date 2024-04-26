package BASICMATHS;

public class GCD {
    public static void highest(int n1,int n2){
        for(int i=Math.min(n1, n2);i>=0;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static int euclideanAlogorithm(int n1,int n2){
        if(n2==0){
            return n1;
        }
        if(n1<n2){
            int temp=n1;
            n1=n2;
            n2=temp;
        }return euclideanAlogorithm(n1-n2, n2);
    }
    public static void main(String[] args) {
        highest(11,12);
        System.out.println(euclideanAlogorithm(9, 15));
    }
}
