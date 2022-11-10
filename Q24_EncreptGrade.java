package jewel.com;
//import java.util.*;
public class Q24_EncreptGrade {
    public static void main(String[] args) {
        /** WAJP to Encrypt a grade by adding '8' to
         it Decrypt it to Show the Show Correct **/

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your Grade:");
//        char grade=sc.next().charAt(1);
//        System.out.println("Your Grade:");
//        // False Grade
//        grade +=8;
//        System.out.println(grade);
//        // True Grade
//        grade -=8;
//        System.out.println(grade);
        char grade='B';
        // False
        grade =(char)(grade+8);
        System.out.println(grade);
        // True
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
