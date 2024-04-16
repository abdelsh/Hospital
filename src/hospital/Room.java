package hospital;

public class Room {
    private int id;
    private double size;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Room() {
    }

    public Room(int id, double size, String location) {
        this.id = id;
        this.size = size;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", size=" + size + ", location=" + location + '}';
    }
    
}
