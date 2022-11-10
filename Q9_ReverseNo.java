package jewel.com;
import java.util.*;
public class Q9_ReverseNo {
    public static void main(String[] args) {
        /** WAJP to Find Reverse of a User Input Number **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to Find Reverse:");
        int n= sc.nextInt();
        int rev=0;

//        using for loop
//        for (int i=n;n>0;i++){
//            rev=(rev*10)+n%10;
//            n=n/10;
//        }
//        using while loop
        while (n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Reverse Number="+rev);
    }
}
