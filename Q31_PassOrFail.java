package jewel.com;
import java.util.*;
public class Q31_PassOrFail {
    public static void main(String[] args) {
        /** WAJP to find out whether a student is pass or fail. If it
         Requires total upto 40% and at least 33% in each Subject to pass
         Assumed 3 subject and take Marks from as a User Input **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Subject Mark:");
        float s1= sc.nextFloat();
        System.out.println("Enter 2nd Subject Mark:");
        float s2= sc.nextFloat();
        System.out.println("Enter 3rd Subject Mark:");
        float s3= sc.nextFloat();
        float total=(s1+s2+s3)/3.0f;
        System.out.println("Your Average Percentage="+total);
        if (total>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congratulation,You have been Promoted");
        }
        else {
            System.out.println("Sorry,You have not been Promoted,Better Luck Next Time");
        }
    }
}
