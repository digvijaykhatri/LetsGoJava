import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalTime;

class events {
    LocalTime eventTime;
    String eventName;
    String description;

    events(LocalTime eventTime, String eventName, String description) {
        this.eventTime = eventTime;
        this.eventName = eventName;
        this.description = description;
    }

    void displayEvents(){
        System.out.println("time :" + eventTime);
        System.out.println("event :" + eventName);
        System.out.println("description :" + description);
    }

}

public class taskmanager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, events> event = new HashMap<Integer, events>();
        System.out.println("Enter the number of events:");
        int numberOfEvents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 1; i <= numberOfEvents; i++) {
            System.out.println("Enter details for event " + i + ":");

            System.out.print("Enter event time (HH:MM): ");
            String timeInput = scanner.nextLine();
            LocalTime eventTime = LocalTime.parse(timeInput);

            System.out.print("Enter event name: ");
            String eventName = scanner.nextLine();

            System.out.print("Enter event description: ");
            String description = scanner.nextLine();

            events events = new events(eventTime, eventName, description);
            event.put(i, events);
        }

        System.out.println("\nDisplaying all events:");
        for (int key : event.keySet()) {
            System.out.println("Event ID: " + key);
            event.get(key).displayEvents();
            System.out.println();
        }

        scanner.close();
    }
}
