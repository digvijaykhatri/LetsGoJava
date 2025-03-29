import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {

            System.out.println("enter the first number: ");
            int a = obj.nextInt();

            System.out.println("enter the second number: ");
            int b = obj.nextInt();

            System.out.println("enter the third number: ");
            int c = obj.nextInt();

            if (a > b && a > c) {
                System.out.println("the greatest number is: " + a);

            } else if (b > a && b > c) {
                System.out.println("the greatest number is: " + b);

            } else {
                System.out.println("the greatest number is: " + c);
                
            }
        }
    }
}