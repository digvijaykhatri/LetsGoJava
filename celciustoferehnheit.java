import java.util.Scanner;

public class celciustoferehnheit {

    public static void main(String[] args) {
        
        System.out.println("Enter temprature in celcius: ");
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        int y = (x*9/5)+32;
        System.out.println("Temprature in ferehnheit is: "+y);

        
        }
    }
