public class Passenger {
    private String name;
    private String passportNumber;
    private String seatNumber;

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
    
    // this method utilises scanner in main
    public static Passenger createPassenger(String name, String passportNumber, String seatNumber) {
        return new Passenger(name, passportNumber, seatNumber);
        // need to add this passenger to the ArrayList
    }
    

}
