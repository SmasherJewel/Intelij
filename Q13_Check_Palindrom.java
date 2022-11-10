package jewel.com;
import java.util.*;
public class Q13_Check_Palindrom {
    public static void main(String[] args) {
        /** WAJP to Check Whether a Number is Palindrome or Not **/

        Scanner sc=new Scanner(System.in);
        int n,z,rev=0;
        System.out.println("Enter No to Check Palindrome or Not:");
        n=sc.nextInt();
        z=n;
        for (int i=n;n>0;i++){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if (rev==z){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
