package jewel.com;
import java.util.*;
public class Q17_Print_MultipleTable {
    public static void main(String[] args) {
        /** WAJP to Print Multiple Table User Input **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Print Table:");
        int n= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("End Table");
    }
}
