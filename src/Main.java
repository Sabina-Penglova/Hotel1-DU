import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
    Guest adela = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 13));
    Guest jan = new Guest("Jan", "Dvoracek", LocalDate.of(1995,5,5));

    jan.setBirthDate(LocalDate.of(1995,4,5));

    System.out.println("----guests---------");
    System.out.println("Guest 1: " + adela.getName() + " " + adela.getSurname() + " (" + adela.getBirthDate() + ")");
    System.out.println("Guest 2: " + jan.getName() + " " + jan.getSurname() + " (" + jan.getBirthDate() + ")");

    Room room1 = new Room(1,1,true,true,3500);
    Room room2 = new Room(2,3, false, false,2500);
    Room room3 = new Room(3,5,false,true,4000);


    System.out.println("-----rooms-------");
    System.out.println("Room " + room1.roomNumber() + ": Beds: " + room1.numberOfBeds() + ". Balcony: " + room1.hasBalcony() + ". See view: "  + room1.hasSeeView() + ". Price per night: " + room1.oneNightPrice());
    System.out.println("Room " + room2.roomNumber() + ": Beds: " + room2.numberOfBeds() + ". Balcony: " + room2.hasBalcony() + ". See view: " + room2.hasSeeView() + ". Price per night: " + room2.oneNightPrice());
    System.out.println("Room " +room3.roomNumber() + ": Beeds: " + room3.numberOfBeds() + ". Balcony: " + room3.hasBalcony() + ". See view: " + room3.hasSeeView() + ". Price per night: " + room3.oneNightPrice());

    List<Guest> reservation1 = new ArrayList<>();
    reservation1.add(adela);

    List<Guest> reservation2 = new ArrayList<>();
    reservation2.add(adela);
    reservation2.add(jan);

    Booking booking1 = new Booking(1, "work", LocalDate.of(2021,7,19), LocalDate.of(2021,7,26), reservation1);
    Booking booking2 = new Booking(3, "vacation", LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), reservation2);

    System.out.println("-----reservations-------");
    System.out.println("Reservation 1. For: " + reservation1.getFirst().getName() + " " + reservation1.getFirst().getSurname()+ ". Room: " + booking1.getRoomNumber() + ". Type of vacation: " + booking1.getTypeOfVacation() + ". From " + booking1.getStartDate() + " to " + booking1.getEndDate());
    System.out.println("Reservation 2. For: " + reservation2.get(0).getName() + " " + reservation2.get(0).getSurname() + " and  " + reservation2.get(1).getName() + " " + reservation2.get(1).getSurname()+ ". Room: " + booking2.getRoomNumber() + ". Type of vacation: " + booking2.getTypeOfVacation() + ". From " + booking2.getStartDate() + " to " + booking2.getEndDate());

    System.out.println("-----all bookings-------");
    BookingManager bookingManager = new BookingManager();
    bookingManager.addBooking(booking1);
    bookingManager.addBooking(booking2);
    bookingManager.printAllBookings();

}
}