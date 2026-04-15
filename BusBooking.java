import java.util.ArrayList;

class User {
    int id;
    String name;
    String destination;

    User(int id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    public String toString() {
        return id + " " + name + " -> " + destination;
    }
}

public class BusBooking {
    public static void main(String[] args) {

        // Buses with max 3 seats
        ArrayList<User> mumbaiBus = new ArrayList<>();
        ArrayList<User> hyderabadBus = new ArrayList<>();
        ArrayList<User> chennaiBus = new ArrayList<>();

        // Users
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Arun", "Mumbai"));
        users.add(new User(2, "Ravi", "Hyderabad"));
        users.add(new User(3, "Sita", "Chennai"));
        users.add(new User(4, "John", "Mumbai"));
        users.add(new User(5, "Ram", "Mumbai"));
        users.add(new User(6, "Anu", "Mumbai")); // should not be added (full)
        users.add(new User(7, "Kiran", "Delhi"));// no matching bus
        users.add(new User(4,"abhii","chennai"));
        
        // Booking logic
        for (User u : users) {
            if (u.destination.equalsIgnoreCase("Mumbai")) {
                if (mumbaiBus.size() < 3) {
                    mumbaiBus.add(u);
                } else {
                    System.out.println("Mumbai bus full for: " + u.name);
                }
            } else if (u.destination.equalsIgnoreCase("Hyderabad")) {
                if (hyderabadBus.size() < 3) {
                    hyderabadBus.add(u);
                } else {
                    System.out.println("Hyderabad bus full for: " + u.name);
                }
            } else if (u.destination.equalsIgnoreCase("Chennai")) {
                if (chennaiBus.size() < 3) {
                    chennaiBus.add(u);
                } else {
                    System.out.println("Chennai bus full for: " + u.name);
                }
            } else {
                System.out.println("No bus available for: " + u.destination);
            }
        }

        // Print final passengers
        System.out.println("\nMumbai Bus:");
        for (User u : mumbaiBus) {
            System.out.println(u);
        }

        System.out.println("\nHyderabad Bus:");
        for (User u : hyderabadBus) {
            System.out.println(u);
        }

        System.out.println("\nChennai Bus:");
        for (User u : chennaiBus) {
            System.out.println(u);
        }
    }
}
