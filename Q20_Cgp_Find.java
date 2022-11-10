package jewel.com;
import java.util.*;
public class Q20_Cgp_Find {
    public static void main(String[] args) {
        /** WAJP to Find CGP of Five Subjects **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Sub Mark:");
        float n1=sc.nextFloat();
        System.out.println("Enter 2nd Sub Mark:");
        float n2=sc.nextFloat();
        System.out.println("Enter 3rd Sub Mark:");
        float n3=sc.nextFloat();
        System.out.println("Enter 4th Sub Mark:");
        float n4=sc.nextFloat();
        System.out.println("Enter 5th Sub Mark:");
        float n5=sc.nextFloat();
        float cgp=(n1+n2+n3+n4+n5)/50.0f;
        System.out.println("Your CGP:"+cgp);
    }
}
