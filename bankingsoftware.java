import java.util.Scanner;
import java.util.HashMap;

class Customer {
    String name;
    int accountNumber;
    double balance;
    int pin;
    Customer(String name, int accountNumber, double balance, int pin){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}


public class bankingsoftware {
    public static void main(String[] args){

        HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
        Customer c1 = new Customer("Dharampal", 1001, 10000, 1001);
        Customer c2 = new Customer("Satpal", 1002, 20000, 1002);
        Customer c3 = new Customer("Rampal", 1003, 30000, 1003);
        Customer c4 = new Customer("Vijaypal", 1004, 40000, 1004);
        
        customers.put(c1.accountNumber, c1);
        customers.put(c2.accountNumber, c2);
        customers.put(c3.accountNumber, c3);
        customers.put(c4.accountNumber, c4);

        try(Scanner obj = new Scanner(System.in);){
            System.out.println("Enter your 4 digit account number: ");
            int accountNumber = obj.nextInt();

            if(customers.containsKey(accountNumber)) {
                System.out.println("\nCustomer Details: ");
                customers.get(accountNumber).displayDetails();

                System.out.println("\n");
                System.out.println("\n");

                System.out.println("To withdraw money press 1");
                System.out.println("To deposit money press 2");
                System.out.println("To exit press 3");
                System.out.println("Enter your choice: ");
                int choice = obj.nextInt();

                    if(choice == 1){
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = obj.nextDouble();
                    if(amount > customers.get(accountNumber).balance){
                        System.out.println("Insufficient balance");
                    } else { 
                        System.out.println("Enter your 4 digit pin: ");
                        int pin = obj.nextInt();
                        if(pin != customers.get(accountNumber).pin){
                            System.out.println("Invalid pin");
                        } else {
                        customers.get(accountNumber).balance -= amount;
                        System.out.println("Withdrawal successful");
                        System.out.println("Updated balance: "+customers.get(accountNumber).balance);
                    }}
                    } 
                    else if(choice == 2){
                    System.out.println("Enter the amount to deposit: ");
                    double amount = obj.nextDouble();
                    customers.get(accountNumber).balance += amount;
                    System.out.println("Deposit successful");
                    System.out.println("Updated balance: "+customers.get(accountNumber).balance);
                    } 
                    else if(choice == 3){
                    System.out.println("Thank you for using our services");
                    } else {
                    System.out.println("Invalid choice");
                    }
                } 
                else {
                System.out.println("Customer not found");
            }
        }
    }
}
