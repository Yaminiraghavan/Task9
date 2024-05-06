import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the input number");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            if(i==2){
                System.out.println("*");
            }else {
                System.out.println("**");
            }

        }
    }
}
