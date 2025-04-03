import java.util.Scanner;
import java.util.HashMap;

class Students { 
    String name;
    int age;
    double grade;

    public Students(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayStudents() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class database {
    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();

        
        Students s1 = new Students("abc", 18, 45.80);
        Students s2 = new Students("bcd", 18, 90.0);
        Students s3 = new Students("def", 18, 88.0);

        students.put(s1.name, s1);
        students.put(s2.name, s2);
        students.put(s3.name, s3);

        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter student name: ");
            String name = obj.nextLine();

            if (students.containsKey(name)) {
                students.get(name).displayStudents();
            } else {
                System.out.println("Student not found!");
            }
        }
    }
}
