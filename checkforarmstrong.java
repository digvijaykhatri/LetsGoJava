import java.util.Scanner;

public class checkforarmstrong {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int number = obj.nextInt();
            int originalNumber = number;
            int n = 0;          
            int tempnum = number;
            while (tempnum > 0) {
                tempnum /= 10;
                n++;
            }
            int sum = 0;
            while (number > 0) {
                int a = number % 10;
                sum += Math.pow(a, n);
                number /= 10;
            }
            if (sum == originalNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
