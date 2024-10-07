import java.time.LocalDate;
import java.util.List;

public class Booking {
    private final int roomNumber;
    private final String typeOfVacation;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final List<Guest> guest;

    public Booking(int roomNumber, String typeOfVacation, LocalDate startDate, LocalDate endDate, List<Guest> guest) {
        this.roomNumber = roomNumber;
        this.typeOfVacation = typeOfVacation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guest = guest;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }


    public String toString() {
        StringBuilder guestsString = new StringBuilder();

        for (Guest g : guest) {
            if (!guestsString.isEmpty()) {
                guestsString.append(", ");
            }
            guestsString.append(g.getName()).append(" ").append(g.getSurname());
        }

        return "Room: " + roomNumber + ", Type: " + typeOfVacation + ", From: " + startDate + " to " + endDate + ", Guests: " + guestsString;
    }
}