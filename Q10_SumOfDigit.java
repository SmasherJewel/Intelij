package jewel.com;
import java.util.*;
public class Q10_SumOfDigit {
    public static void main(String[] args) {
        /** WAJP to Find Sum of Digit User Input Number **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to Find Sum of Digit:");
        int n= sc.nextInt();
        int digitSum=0;
        for (int i=n;n>0;i++){
            digitSum=digitSum+n%10;
            n=n/10;
        }
        System.out.println("Sum of Digit="+digitSum);
    }
}
