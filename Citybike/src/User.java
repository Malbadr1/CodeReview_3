import java.util.ArrayList;

public class User {
    private String id;
    private String name;
    private String sureName;
    private  int currentlyRentedBike;
    private ArrayList<Bike> bikesRented = new ArrayList<>();


    public User() {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
        this.bikesRented = bikesRented;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public ArrayList<Bike> getBikesRented() {
        return bikesRented;
    }

    public void setBikesRented(ArrayList<Bike> bikesRented) {
        this.bikesRented = bikesRented;
    }

    public void attachBike(Bike bike) {

        this.bikesRented.add(bike);
    }

    public void disPlayBikeRented() {
        for (Bike element : bikesRented) {
            System.out.println(element);
        }
    }
}