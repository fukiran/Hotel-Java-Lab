import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;
import room.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guest3 = new Guest("Mob");
        conferenceRoom = new ConferenceRoom(2, "Main", RoomType.DOUBLE);
    }
    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Main", conferenceRoom.getName());
    }

    @Test
    public void guestListSizeStartsAt0() {
        assertEquals(0, conferenceRoom.guestListSize());
    }

    @Test
    public void canCheckInGuest_underCapacity() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestListSize());
    }

    @Test
    public void canCheckInGuest_atCapacity() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        assertEquals(2, conferenceRoom.guestListSize());
    }

    @Test
    public void cantCheckInGuest_overCapacity() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.guestListSize());
    }

    @Test
    public void canCheckOutGuests() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuests();
        assertEquals(0, conferenceRoom.guestListSize());
    }
}