public class Bike {

    private int id;
    private String color;
   public   static int count = 0;

    public Bike(int id,String color) {
        this.id = id++;
        this.color = color;
        count++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Bike: " +
                "id=" + id +
                ", color='" + color;
    }

}





