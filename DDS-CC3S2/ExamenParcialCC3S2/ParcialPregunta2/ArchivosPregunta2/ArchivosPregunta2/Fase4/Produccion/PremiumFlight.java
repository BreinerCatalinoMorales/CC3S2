public class PremiumFlight extends Flight {

    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return true;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return true;
    }

}

