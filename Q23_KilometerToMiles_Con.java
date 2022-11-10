package jewel.com;
import java.util.*;
public class Q23_KilometerToMiles_Con {
    public static void main(String[] args) {
        /** WAJP to Convert Kilometer to Miles **/

        Scanner sc=new Scanner(System.in);
        float miles,km;
        System.out.println("Enter Distance Into Kilometer");
        km= sc.nextFloat();
        miles=(float) (km*0.621371);
        System.out.println(km+" Kilometer="+miles);
    }
}
