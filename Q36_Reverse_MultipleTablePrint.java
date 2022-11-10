package jewel.com;
import java.util.Scanner;
public class Q36_Reverse_MultipleTablePrint {
    public static void main(String[] args) {
        /** WAJP to Print Multiple Table in a Reverse Order **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Print Table:");
        int n= sc.nextInt();
        for (int i=10;i>=1;i--){
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("End Table");
    }
}
