import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");
        Double num1 =s.nextDouble();
        Double num2 =s.nextDouble();
        Double num3 =s.nextDouble();

        double largest = num1;
        if (num2>largest){
            largest=num2;
        }
        if (num3>largest){
            largest=num3;
        }
        System.out.println("The largest numer is "+ largest);
    }
}
