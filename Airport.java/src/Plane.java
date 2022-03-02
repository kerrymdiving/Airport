import java.util.Stack;

public class Plane {
    private Stack<Passenger> passengersOnPlane = new Stack<>();
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void passengerBoards(Passenger passenger) {
        this.passengersOnPlane.push(passenger);
    }
    
    public void passengerDisembarks(Passenger passenger) {
        this.passengersOnPlane.pop();
    }
    

}
