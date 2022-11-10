package jewel.com;
import java.util.*;
public class Q16_PrintN_NumberOf_Prime {
    public static void main(String[] args) {
        /** WAJP to Print Prime Numbers 1 to N and Count Total Numbers User Input **/

        Scanner sc=new Scanner(System.in);
        int n,count,total=0;
        System.out.println("Enter N No to Print Prime Numbers");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
                }
            if (count==2){
                System.out.println(i);
                total=total+1;
            }
        }
        System.out.println("Total Prime Numbers="+total);
    }
}
