import java.util.Scanner;

public class solvequadeqn {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {

            System.out.println("enter the value of a: ");
            int a = obj.nextInt();

            System.out.println("enter the value of b: ");
            int b = obj.nextInt();

            System.out.println("enter the value of c: ");
            int c = obj.nextInt();

            double d = b*b - 4*a*c;

            if(d>0){
                System.out.println("the roots are real and distinct");
                double r1 = (-b + Math.sqrt(d))/(2*a);
                double r2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("the roots are: " + r1 + " and " + r2);
            }

            else if(d==0){
                System.out.println("the roots are real and equal");
                double r1 = -b/(2*a);
                System.out.println("the root is: " + r1);
            }

            else{
                System.out.println("the roots are imaginary");
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / (2 * a);
                System.out.println("The roots are complex and conjugate.");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}
