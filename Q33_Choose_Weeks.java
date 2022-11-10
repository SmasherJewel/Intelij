package jewel.com;
import java.util.*;
public class Q33_Choose_Weeks {
    public static void main(String[] args) {
        /** WAJP to find out rhe day of the week given the numbers
         [1 for monady 2 for tuesday...........and so on] **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Chose: 1 to 7");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Choice");
        }
    }
}
