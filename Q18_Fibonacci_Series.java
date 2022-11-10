package jewel.com;

import java.util.Scanner;

public class Q18_Fibonacci_Series {
    public static void main(String[] args) {
        /** WAJP to Print Fibonacci Series **/

        // N No Fibonacci
//        Scanner sc=new Scanner(System.in);
//        int n,x=0,y=1,z=0;
//        System.out.println("Enter Number to Print Fibonacci Series:");
//        n= sc.nextInt();
//        for (int i=n;z<=n;i++){
//            System.out.println(z);
//            x=y;
//            y=z;
//            z=x+y;
//        }
//        System.out.println("End Fibonacci Series");

        // N Term Fibonacci
        Scanner sc=new Scanner(System.in);
       int n,x=0,y=1,z=0,term=1;
       System.out.println("Enter Number to Print Fibonacci Series:");
        n= sc.nextInt();
        for (int i=n;term<=n;i++){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
            term=term+1;
        }
       System.out.println("End Fibonacci Series");

    }
}
