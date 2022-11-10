package jewel.com;
import java.util.*;
public class Q35_LeapYearOrNot {
    public static void main(String[] args) {
        /** WAJP to Check Year is Leap Year or Not **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year to Check is Leap Year or Not:");
        int year= sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Year is Leap Year");
                }
                else {
                    System.out.println("Year is Not Leap Year");
                }
            }
            else {
                System.out.println("Year is Not Leap Year");
            }
        }
        else {
            System.out.println("Year is Not Leap Year");
        }
    }
}
