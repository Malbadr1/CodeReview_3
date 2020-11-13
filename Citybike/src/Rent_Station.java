public class Rent_Station {
    private  Station stationStart;
    private Station stationEnd;

    public Rent_Station(Station stationStart, Station stationEnd) {
        this.stationStart = stationStart;
        this.stationEnd = stationEnd;
    }

    public Station getStationStart() {
        return stationStart;
    }

    public void setStationStart(Station stationStart) {
        this.stationStart = stationStart;
    }

    public Station getStationEnd() {
        return stationEnd;
    }

    public void setStationEnd(Station stationEnd) {
        this.stationEnd = stationEnd;
    }

    @Override
    public String toString() {
        return "Rent_Station{" +
                "stationStart=" + stationStart +
                ", stationEnd=" + stationEnd +
                '}';
    }
}
