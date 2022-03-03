import java.util.ArrayList;

public class Airport {
    private String name;
    private String terminal;
    private int noOfCheckedInPassengers;
    private ArrayList<Passenger> passengerCheckedIn = new ArrayList<>();
    
    public Airport(String name, String terminal) {
        this.name = name;
        this.terminal = terminal;
    }

    public String getName() {
        return name;
    }

    public String getTerminal() {
        return terminal;
    }
    
    public int getNoOfCheckedInPassengers() {
        return noOfCheckedInPassengers;
    }
    
    public void checkIn(Passenger passenger) {
        this.passengerCheckedIn.add(passenger);
        noOfCheckedInPassengers = passengerCheckedIn.size();
        // change local variable value to length of array
    }

    // hashmap of routes allocate to passenger

    // public Airport() {
    //     // create passengers manually for now....
    //     passengerCheckedIn.add(new Passenger("Kerry", "A123456", "A1"));
    //     passengerCheckedIn.add(new Passenger("Bob", "B123456", "A2"));
    //     passengerCheckedIn.add(new Passenger("Fred", "C123456", "A3"));
    //     passengerCheckedIn.add(new Passenger("Mike", "D123456", "A4"));
    //     passengerCheckedIn.add(new Passenger("Lisa", "E123456", "A5"));

    // }

    
}
