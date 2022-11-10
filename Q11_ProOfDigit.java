package jewel.com;
import java.util.*;
public class Q11_ProOfDigit {
    public static void main(String[] args) {
        /** WAJP to Find Product of Digit User Input Number **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No to Find Product of Digit:");
        int n=sc.nextInt();
        int proSum=1;

//        using for loop
//        for (int i=n;n>0;i++){ //Not Working
//            proSum=(proSum*n%10);
//            n=n/10;
//        }

//        using while loop
        while(n>0){
            proSum=(proSum*n%10);
            n=n/10;
        }
        System.out.println("Product of Digit="+proSum);
    }
}
