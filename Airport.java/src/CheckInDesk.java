public class CheckInDesk {
    private Airport airport;

    public CheckInDesk(Airport airport) {
        this.airport = airport;
    }

    public void checkIn(Passenger passenger) {
        BoardingPass bp = new BoardingPass(1, 1);
        passenger.setBoardingPass(bp);
        Bag passengersBag = passenger.getBag();
        Plane plane = this.airport.planeAt(passenger.getFlightNo());
        plane.boardPassenger(passenger);

    }
}
