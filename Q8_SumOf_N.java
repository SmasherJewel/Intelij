package jewel.com;
import java.util.*;
public class Q8_SumOf_N {
    public static void main(String[] args) {
        /** WAJP to Find Sum of First N Natural Numbers **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  No to Find  N Numbers of Sum:");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of N Natural Numbers="+sum);
    }
}
