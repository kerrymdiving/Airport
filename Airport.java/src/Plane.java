// import java.util.Stack;

public class Plane {
    // private Stack<Passenger> passengersOnPlane = new Stack<>();
    private String name;
    // NB review how the array is initiated
    Passenger[][] seats = {
        { null, null, null },
        { null, null, null },
        { null, null, null },
        { null, null, null },
        { null, null, null },
        { null, null, null },
        { null, null, null }
    };

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    public Boolean seatIsEmpty(BoardingPass bpass) {
        int row = bpass.createBoardingPass()[0];
        int seat = bpass.createBoardingPass()[1];
        return this.seats[row][seat] == null;
    } 

    public void boardPassenger(Passenger passenger) {
        int row = passenger.getBoardingPass().createBoardingPass()[0];
        int seat = passenger.getBoardingPass().createBoardingPass()[1];
        this.seats[row][seat] = passenger;
    }
}

    // public void passengerBoards(Passenger passenger) {
    //     this.passengersOnPlane.push(passenger);
    // }
    
    // public void passengerDisembarks(Passenger passenger) {
    //     this.passengersOnPlane.pop();
    // }
 