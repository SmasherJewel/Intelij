package jewel.com;
import java.util.*;
public class Q7_PrintN_Number {
    public static void main(String[] args) {
        /** WAJP to Print 1 to N User Input **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Number to be Print:");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println("Numbers are Printed");
    }
}
