package jewel.com;
import java.util.*;
public class Q22_Check_IntOrNot {
    public static void main(String[] args) {
        /** WAJP to String the User Enter is this Int or Not **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        boolean num= sc.hasNextInt();
        System.out.println(num);
    }
}
