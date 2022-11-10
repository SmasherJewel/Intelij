package jewel.com;

public class Q26_StringBasic_Fn {
    public static void main(String[] args) {

        String name="Dikshit";
        //For Finding Length
        System.out.println(name.length());
        // For Lower Case
        System.out.println(name.toLowerCase());
        // For Upper Case
        System.out.println(name.toUpperCase());

        String name1="               Farhad           ";
        // Trim Spaces
        System.out.println(name1.trim());
        // Non-Trim
        System.out.println(name1);

        String name2="Raja";
        // Start With
        System.out.println(name2.substring(2));// Given Index Value to be Print
        // Start With and Ends With
        System.out.println(name2.substring(1,3));// One Step Back Ends With (it's return aj)
        System.out.println(name2.substring(1,4));// and it will return (aja) and correct
        // Replace Character
        System.out.println(name2.replace('R','B'));

        String name3="Akash";
        // Starts With or Not
        System.out.println(name3.startsWith("ak"));// Case Sensitive and this fn return boolean (false in this case)
        System.out.println(name3.startsWith("Ak"));// it's return true
        //Ends With or Not
        System.out.println(name3.endsWith("sh"));// it's return true
        System.out.println(name2.endsWith("ah"));// it's return false
        // Index Position Character Return
        System.out.println(name3.charAt(3));

        String name4="Saalim";
        // Check Equal or Not
        System.out.println(name4.equals("saalim"));// boolena reaturn (false in this case)
        System.out.println(name4.equals("Saalim"));// true in this case
        // Equal or Not and Ignore Case
        System.out.println(name4.equalsIgnoreCase("saalim"));// true in this case
        System.out.println(name4.equalsIgnoreCase("Salim"));// false in this case

        String name5="Susavan";
        // Starting index Return
        System.out.println(name5.indexOf("a"));// in this case it's return '3' remember index starts with '0'
        // Starting Searching from index no '2'
        System.out.println(name5.indexOf("s",2));
        // Last Position index return
        System.out.println(name5.lastIndexOf("a"));
        // It will be searching from starting to upto '4'
        System.out.println(name5.lastIndexOf("a",4));// in this case it will return '3'

        String name6="";// in this its like that {String name6="Jewel"} then it's return false
        // Check it's Empty or Not
        System.out.println(name6.isEmpty());// it will return boolean

        String name7="Saif";
        String name8="Asif";
        // To Merge Two String
        System.out.println(name7.concat(name8));
    }
}
