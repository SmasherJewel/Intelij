package jewel.com;
import java.util.Scanner;

public class Q15_Find_Factorial {
    public static void main(String[] args) {
        /** WAJP to Find Factorial of a given Number User Input **/

        Scanner sc=new Scanner(System.in);
        int n,fac=1;
        System.out.println("Enter No to Find Factorial:");
        n=sc.nextInt();
        for (int i=n;i>1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        System.out.println("End Factorial");
    }
}
