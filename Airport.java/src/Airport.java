import java.util.HashMap;

public class Airport {
    String airportName;
    private HashMap<String, Plane> gates;
    CheckInDesk[] checkInDesks;

    public Airport(String name) {
        this.airportName = name;
        this.gates = new HashMap<>();
        this.checkInDesks = new CheckInDesk[] {
            new CheckInDesk(this),
            new CheckInDesk(this),
            new CheckInDesk(this)
        };
    }

    public String getAirportName() {
        return airportName;
    }

    public void landPlane(Plane plane) {
        this.gates.put(plane.getName(), plane);
    }
    // .put and .get
    public Plane planeAt(String gateKey) {
        return this.gates.get(gateKey);
    }
}
