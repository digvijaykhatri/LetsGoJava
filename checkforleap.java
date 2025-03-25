import java.util.Scanner;

public class checkforleap {
    public static void main(String[] arcg) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = obj.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("the year is a leap year");
                } else {
                    System.out.println("the year is not a leap year");
                }
            } else {
                System.out.println("the year is a leap year");
            }
        } else {
            System.out.println("the year is not a leap year");
        }
    }
}
