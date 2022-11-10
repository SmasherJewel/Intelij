package jewel.com;
import java.util.*;
public class Q32_CalculateTax {
    public static void main(String[] args) {
        /** WAJP to Calculate income tax for paid by an employ to the
         government as per the slaves mentioned below:
         below 2.5L tax=0,2.5L-5.0L tax=5%, 5.0L-10.0L tax=20%, above 10.0L tax=30% **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Income:");
        float income= sc.nextFloat();
        float tax=0;
        if (income<=250000){
            tax=tax+0;
        } else if (income>250000 && income<=500000) {
            tax=tax+0.05f*(income-2500000);
            tax=tax+0.05f*(income-500000);
        } else if (income>500000 && income<=1000000) {
            tax=tax+0.2f*(income-500000);
            tax=tax+0.2f*(income-1000000);
        } else if (income>1000000) {
            tax=tax+0.3f*(income-1000000);
        }
        System.out.println("Your Total Tax="+tax);
    }
}
