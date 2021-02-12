import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE);
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
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestListSize());
    }
}