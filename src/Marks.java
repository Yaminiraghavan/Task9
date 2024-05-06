import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks scored by the students");
        int mark = s.nextInt();
        System.out.println("Grade: " + calculateGrade(mark));
    }
        public static String calculateGrade(int mark){
            if (mark > 100) {
                return "Invalid Input";
            } else if (mark >= 90) {
                
                return "A";
            } else if (mark >= 80) {
                return "B";
            } else if (mark >= 70) {
                return "C";
            } else if (mark >= 60) {
                return "D";
            } else if (mark >= 50) {
                return "E";
            } else {
                return "F";
            }
        }
    }

