package jewel.com;
import java.util.*;
public class Q1_Ractangle_Area_Pera {
    public static void main(String[] args) {
        /** WAJP to Find Area and Perimeter of a Ractangle **/

        Scanner sc=new Scanner(System.in);
        int len,bre,area,pera;
        System.out.println("Enter the Length:");
        len=sc.nextInt();
        System.out.println("Enter the Bridth:");
        bre=sc.nextInt();
        area=(len+bre);
        pera=2*(len+bre);
        System.out.println("Area of a Ractangle="+area);
        System.out.println("Perimeter of a Ractangle="+pera);
    }
}
