package jewel.com;
import java.util.*;
public class Q6_Calculator_Switch {
    public static void main(String[] args) {
        /** WAJP to Create a Simple Calculator Using Switch Case **/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No:");
        int n1= sc.nextInt();
        System.out.println("Enter 2nd No:");
        int n2= sc.nextInt();
        System.out.println("Enter Your Choice:\n +->Addition\n -->Subtraction\n *->Multiplication\n /->Division\n %->Remainder\n Chose Your Option");
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println("Addition="+(n1+n2));
                break;
            case '-':
                System.out.println("Subtraction="+(n1-n2));
                break;
            case '*':
                System.out.println("Multiplication="+(n1*n2));
                break;
            case '/':
                System.out.println("Division="+(n1/n2));
                break;
            case '%':
                System.out.println("Remainder="+(n1%n2));
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
