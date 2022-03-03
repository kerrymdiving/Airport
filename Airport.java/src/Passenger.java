public class Passenger {
    private String name;
    private String passportNumber;
    private String seatNumber;
    private BoardingPass boardingPass;
    private Bag bags;
    private Airport airportName;
    private String flightNo;

    public Passenger(String name, String passportNumber, String seatNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }
   
    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }

    public void setBag(Bag bag) {
        this.bags = bag;
    }

    public Bag getBag() {
        Bag bag = this.bags;
        this.bags = null;
        return bag;
        // make varible for the bag
        // set this bag to be null
        // return the bag
    }
    public Airport getAirportName() {
        return airportName;
    }

    public void setAirportName(Airport airportName) {
        this.airportName = airportName;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }
    

}
