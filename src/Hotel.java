import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int month = s.nextInt();
        System.out.println("Enter the room rent per day");
        double rent = s.nextDouble();
        System.out.println("Enter the number of days stayed");
        int days = s.nextInt();

        double totaltariff = 0.0;
        switch (month){
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totaltariff = rent*days*1.20;
                break;
            default:
                totaltariff = rent*days;
                break;

        }
        System.out.println("Total amount to be paid "+ totaltariff);
    }
}
