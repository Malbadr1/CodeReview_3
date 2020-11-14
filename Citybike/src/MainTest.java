import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class MainTest {
    public static void main(String[] args) {


        Bike bike1 = new Bike(1, "red");
        Bike bike2 = new Bike(2, "yellow");
        Bike bike3 = new Bike(3, "green");
        Bike bike4 = new Bike(4, "whit");
        Bike bike5 = new Bike(5, "black");
        Bike bike6 = new Bike(6, "grey");
        Bike bike7 = new Bike(7, "brown");
        Bike bike8 = new Bike(8, "pink");


        HashMap<Integer, Bike> bikes = new HashMap<>();
        bikes.put(bike1.getId(), bike1);
        bikes.put(bike2.getId(), bike2);
        bikes.put(bike3.getId(), bike3);
        bikes.put(bike4.getId(), bike4);
        bikes.put(bike5.getId(), bike5);
        bikes.put(bike6.getId(), bike6);
        bikes.put(bike7.getId(), bike7);
        bikes.put(bike8.getId(), bike8);

        Station station1 = new Station(1, "lechnerStrasse");
        Station station2 = new Station(2, "wienMitte");
        Station station3 = new Station(3, "meidling");
        Station station4 = new Station(4, "KarlisPlaz");

        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(station1.getStationID(), station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);
        stations.put(station4.getStationID(), station4);


        User user1=new User();
        user1.setName("Joe ");
        user1.setSureName("Deo");

        User user2=new User();
        user2.setName("Mary");
        user2.setSureName("Maxi");


        Station station=new Station(bikes);
        station1.getStationID();


        station.printStation();



       Station stationStart1=new Station(4,"KarlisPlaz");
       Station stationEnd1= new Station(2,"wien mitte");

        Station stationStart2=new Station(3,"meidling");
        Station stationEnd2= new Station(1,"wien mitte");


        Date date1=new Date();
        SimpleDateFormat sf=new SimpleDateFormat();

        Date date2= new Date();
        SimpleDateFormat sf1=new SimpleDateFormat();

        station.rentBike(user1,bike1,new Rent_Station(stationStart1,stationEnd1));

      user1.disPlayBikeRented();

       station.rentBikeDate(user1,bike1,new Rent_Date(date1,date2));


        station.rentBike(user2,bike2,new Rent_Station(stationStart2,stationEnd2));

        user2.disPlayBikeRented();

        station.rentBikeDate(user2,bike2,new Rent_Date(date1,date2));

    }
}
