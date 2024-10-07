public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasSeeView;
    private double oneNightPrice;

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeeView, double oneNightPrice) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeeView = hasSeeView;
        this.oneNightPrice = oneNightPrice;

    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasSeeView() {
        return hasSeeView;
    }

    public double getOneNightPrice() {
        return oneNightPrice;

    }
}