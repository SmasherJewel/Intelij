package jewel.com;

import java.util.Scanner;

public class Q5_Calculator_Loop {
    public static void main(String[] args) {
        /** WAJP to Create a Simple Calculator Using Loop **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No:");
        int n1= sc.nextInt();
        System.out.println("Enter 2nd No:");
        int n2= sc.nextInt();
        System.out.println("Enter Your Choice:\n 1->Addition\n 2->Subtraction\n 3->Multiplication\n 4->Division\n 5->Remainder\n Chose Your Option");
        int ch= sc.nextInt();
        if (ch==1){
            System.out.println("Addition="+(n1+n2));
        } else if (ch==2) {
            System.out.println("Subtraction="+(n1-n2));
        } else if (ch==3) {
            System.out.println("Multiplication="+(n1*n2));
        } else if (ch==4) {
            System.out.println("Division="+(n1/n2));
        } else if (ch==5) {
            System.out.println("Remainder="+(n1%n2));
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
