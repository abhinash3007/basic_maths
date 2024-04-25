package BASICMATHS;

import java.util.*;
public class countDigit{
    public static int count(int n){
        int c=0;
        while (n>0) {
            int lastDigit=n%10;
            System.out.println(lastDigit);
            c=c+1;
            n=n/10;
        }return c;
    }
    public static void main(String[]args){
       System.out.println("total digit:"+ count(7789));

    }
}
