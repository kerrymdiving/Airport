import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        // boolean quit = false;
        // printMenu();

        // while (!quit) {
        //     System.out.println("\nEnter your choice: ");
        //     int action = scanner.nextInt();
        //     scanner.nextLine();

        //     switch (action) {
        //         case 0:
        //             System.out.println("\nShutting down.....");
        //             quit = true;
        //             break;
        //         case 1:
        //             addNewPassenger();
        //             break;
        //         case 2:
        //             Bag bag = new Bag(16);
        //             break;
        //         case 3:
        //             printPassengerList();
        //             break;

        //     }
        // }

    }

    private static void printPassengerList() {

    }

    public static void printMenu() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To shutdown");
        System.out.println("\t 1 - To add new passenger");
        System.out.println("\t 2 - To add a bag");
        System.out.println("\t 3 - To print passenger manifest");
    }

    private static void addNewPassenger() {
        System.out.println("Enter Passenger name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Passport number: ");
        String passportNumber = scanner.nextLine();
        System.out.println("Enter seat number: ");
        String seatNumber = scanner.nextLine();
        Passenger newPassenger = Passenger.createPassenger(name, passportNumber, seatNumber);
    }

}
