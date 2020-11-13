import java.util.Date;

public class Rent_Date {




    private Date rentStart;
    private Date rentEnd;

    public Rent_Date(Date rentStart, Date rentEnd) {
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentStart=" + rentStart +
                ", rentEnd=" + rentEnd +
                '}';
    }
}
