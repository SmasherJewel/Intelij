package jewel.com;
import java.util.*;
public class Q2_Max_Find {
    public static void main(String[] args) {
        /** WAJP to Find Max between Three Numbers **/

        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter 1st No:");
        n1=sc.nextInt();
        System.out.println("Enter 2nd No:");
        n2=sc.nextInt();
        System.out.println("Enter 3rd No:");
        n3=sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println("Max No="+n1);
        }
        else if (n2>n1 && n2>n3) {
            System.out.println("Max No="+n2);
        }
        else{
            System.out.println("Max No="+n3);
        }
    }
}
