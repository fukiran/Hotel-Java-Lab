import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        Guest guest = new Guest("Bob");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        conferenceRoom = new ConferenceRoom(50, "Main", guests);
    }
    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }
}
