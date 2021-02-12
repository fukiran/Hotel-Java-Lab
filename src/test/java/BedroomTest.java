import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    @Before
    public void before() {
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guest3 = new Guest("Mob");
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, 75.50);
    }
    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasNumber() {
        assertEquals(21, bedroom.getNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestListSize());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(75.50, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void guestListSizeStartsAt0() {
        assertEquals(0, bedroom.guestListSize());
    }

    @Test
    public void canCheckInGuest_underCapacity() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestListSize());
    }

    @Test
    public void canCheckInGuest_atCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.guestListSize());
    }

    @Test
    public void cantCheckInGuest_overCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestListSize());
    }

    @Test
    public void canCheckOutGuests() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuests();
        assertEquals(0, bedroom.guestListSize());
    }

    @Test
    public void checkIsVacant_true() {
        assertEquals(true, bedroom.isVacant());
    }

    @Test
    public void checkIsVacant_false() {
        bedroom.addGuest(guest1);
        assertEquals(false, bedroom.isVacant());
    }

}