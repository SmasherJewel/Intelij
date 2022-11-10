package jewel.com;
import java.util.*;
public class Q37_SumOf_MultipleTable {
    public static void main(String[] args) {
        /** WAJP to Calculate the sum of the numbers Occurring
         the Multiplication Table of '8' **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Table NO to Print Sum of Multiplication:");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= 10 ; i++) {
            sum=sum+n*i;
        }
        System.out.println("Sum of Multiplication of a Table="+sum);
    }
}
