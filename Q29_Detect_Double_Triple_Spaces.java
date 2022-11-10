package jewel.com;

public class Q29_Detect_Double_Triple_Spaces {
    public static void main(String[] args) {
        /** WAJP to Detect Double & Triple Spaces in a String **/

        String detect="This  is not   easy";
        System.out.println(detect.indexOf("  "));// it's return '4'
        System.out.println(detect.indexOf("   "));// it's return '12'
    }
}
