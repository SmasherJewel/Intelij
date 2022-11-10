package jewel.com;

public class Q28_ReplaceWords {
    public static void main(String[] args) {
        /** WAJP to Fill in a letter Template which looks like below:
         letter="Dear <|name|>, thanks a lot" **/

        String letter="Dear <|name|>, thanks a lot";
        System.out.println(letter.replace("<|name|>","Jewel"));
    }
}
