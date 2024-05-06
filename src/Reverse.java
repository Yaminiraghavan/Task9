import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        String reverse = "" ;
        int length = str.length();
        char ch;
        for (int i = 0; i <length ; i++) {
            ch=str.charAt(i);
            reverse= ch + reverse;
        }
        System.out.println("reversestring : "+ reverse);
    }
}
