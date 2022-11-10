package jewel.com;
import java.util.*;
public class Q19_Find_Exponent {
    public static void main(String[] args) {
        /** WAJP to Find Exponent of Number User Input **/

        Scanner sc=new Scanner(System.in);
        int base,power,result=1;
        System.out.println("Enter Base");
        base=sc.nextInt();
        System.out.println("Enter Power");
        power=sc.nextInt();
        while (power>0){
            result=result*base;
            power--;
        }
        System.out.println("Exponent="+result);
    }
}
