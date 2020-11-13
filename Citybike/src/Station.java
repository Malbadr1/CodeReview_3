import java.util.Date;
import java.util.HashMap;

public class Station {
    private int stationID;
    private String position;
    private HashMap<Integer,Bike> bikes;

    private Rent_Station rent_station;

    public Station(int stationID, String position) {
        this.stationID = stationID;
        this.position = position;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String name) {
        this.position=position;
    }

    public HashMap<Integer, Bike> getBooks() {
        return bikes;
    }

    public void setBooks(HashMap<Integer, Bike> books) {
        this.bikes = books;
    }

    public Rent_Station getRent() {
        return rent_station;
    }

    public void setRent(Rent_Station rent_station) {
        this.rent_station = rent_station;
    }

    public Station(HashMap<Integer,Bike> bikes){
        this.bikes=bikes;
    }

    public boolean rentBike(User user,Bike bike,Rent_Station rent_station){
      Station stationStart =rent_station.getStationStart();
     Station stationEnd =rent_station.getStationEnd();

user.attachBike(bike);
        bikes.remove(bike.getId());
        System.out.println("User : "+"\t"+user.getName()+"\t"+" now renting bike Id:"+"\t"+bike.getId()+"\t"+"from"+"\t"+stationStart+
                "\n"+"User : "+"\t"+user.getName()+"\t"+" now returned bike Id:"+"\t"+bike.getId()+"\t"+"to"+"\t"+stationEnd);
        return true;
        }

    public boolean   rentBikeDate(User user,Bike bike,Rent_Date rent_date){
        Date rentStart=rent_date.getRentStart();
        Date rentEnd= rent_date.getRentEnd();
        user.attachBike(bike);
        bikes.remove(bike.getId());
        System.out.println("User : "+"\t"+user.getName()+"\t"+" now renting bike Id:"+"\t"+bike.getId()+"\t"+"from"+"\t"+rentStart+
                "\n"+"User : "+"\t"+user.getName()+"\t"+" now returned bike Id:"+"\t"+bike.getId()+"\t"+"to"+"\t"+rentEnd);
        return true;

    }



    public void printStation(){
        for (Bike i:bikes.values()) {
            System.out.println(i);

        }
    }

    @Override
    public String toString() {
        return
                "stationID=" + stationID +
                ", position='" + position
                ;
    }
}