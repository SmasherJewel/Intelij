package jewel.com;
import java.util.*;
public class Q3_Even_Odd_Check {
    public static void main(String[] args) {
        /** WAJP to Check Number is Even Or Odd **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to Check Even or Odd:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
