package jewel.com;
import java.util.*;
public class Q12_SumOfEven_ProOdd {
    public static void main(String[] args) {
        /** WAJP to Find Sum of Even and Product of Odd Number **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        int n=sc.nextInt();
        int pro=1,sum=0,digit;
        for(int i=n;n>0;i++){
            digit=n%10;
            if (digit%2==0){
                sum=sum+digit;
            }
            else {
                pro=pro*digit;
            }
            n=n/10;
        }
        System.out.println("Sum of Even Digit="+sum);
        System.out.println("Product of Odd Digit="+pro);
    }
}
