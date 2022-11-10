package jewel.com;
import java.util.*;
public class Q4_Check_Poss_Neg_Zero {
    public static void main(String[] args) {
        /** WAJP to Check Number is Positive or Negative or Zero **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to be Check:");
        int n= sc.nextInt();
        if (n>0){
            System.out.println("Positive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
