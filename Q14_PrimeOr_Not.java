package jewel.com;
import java.util.*;
public class Q14_PrimeOr_Not {
    public static void main(String[] args) {
        /** WAJP to Check No is Prime or Not **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to Check Prime or Not:");
        int n= sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime No");
        }
        else {
            System.out.println("Not Prime No");
        }
    }
}
