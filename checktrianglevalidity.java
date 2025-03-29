import java.util.Scanner;

public class checktrianglevalidity {

    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in);){

        System.out.println("enter the first side of the triangle: ");
        int a = obj.nextInt();

        System.out.println("enter the second side of the triangle: ");
        int b = obj.nextInt();

        System.out.println("enter the third side of the triangle: ");
        int c = obj.nextInt();

            if (a + b > c && b + c > a && c + a > b) {
            System.out.println("the triangle is valid.");
            if (a == b && b == c) {
                System.out.println("the triangle is equilateral.");

            } else if (a == b || b == c || c == a) {
                System.out.println("the triangle is isosceles.");

            } else {
                System.out.println("the triangle is scalene.");
            }
            
            } else {
            System.out.println("the triangle is invalid.");
            }
        }
    }
}