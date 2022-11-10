package jewel.com;
import java.util.*;
public class Q34_WebsiteUrl {
    public static void main(String[] args) {
        /** WAJP to find out the type of Website from the url
         * .com->Commercial Website
         * .org->Organisation Website
         * .in->Indian Website **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Type Website");
        String website= sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an Organisation Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }
        else {
            System.out.println("This is not Support our Program");
        }
    }
}
