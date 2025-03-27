import java.util.Scanner;
import java.util.HashMap;

static class Student {
    String name;
    int roll;
    double marks;
    char grade;
    Student(String name, int roll, double marks, char grade){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.grade = grade;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}

public static void main(String[] args){
    
        HashMap<Integer, Student> students = new HashMap<Integer, Student>();
        Student s1 = new Student("Dharampal", 1, 90, 'A');
        Student s2 = new Student("Satpal", 2, 80, 'B');
        Student s3 = new Student("Rampal", 3, 70, 'C');
        Student s4 = new Student("Vijaypal", 4, 60, 'D');
        
        students.put(s1.roll, s1);
        students.put(s2.roll, s2);
        students.put(s3.roll, s3);
        students.put(s4.roll, s4);
    
        try(Scanner obj = new Scanner(System.in);){
            System.out.println("Enter your roll number: ");
            int roll = obj.nextInt();
    
            if(students.containsKey(roll)) {
                System.out.println("\nStudent Details: ");
                students.get(roll).displayDetails();
    
                System.out.println("\n");
                System.out.println("\n");
    
                System.out.println("To change marks press 1");
                System.out.println("To change grade press 2");
                System.out.println("To exit press 3");
                System.out.println("Enter your choice: ");
                int choice = obj.nextInt();
    
                    if(choice == 1){
                    System.out.println("Enter the new marks: ");
                    double marks = obj.nextDouble();
                    students.get(roll).marks = marks;
                    System.out.println("Marks updated successfully");
                } else if(choice == 2){
                    System.out.println("Enter the new grade: ");
                    char grade = obj.next().charAt(0);
                    students.get(roll).grade = grade;
                    System.out.println("Grade updated successfully");
                } else if(choice == 3){
                    System.out.println("Exiting...");
                } else {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Student not found");
            }
        }
}