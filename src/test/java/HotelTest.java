import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.ConferenceRoom;
import room.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        guest = new Guest("Bob");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, guests);
        conferenceRoom = new ConferenceRoom(2, "Main", RoomType.DOUBLE, guests);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasHotelBedRoom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms());
    }

    @Test
    public void hasBedroomGuest() {
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.getGuests().size());
    }
    @Test
    public void hasConferenceRoomGuest() {
        hotel.checkIn(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuests().size());
    }

    @Test
    public void canRemoveGuestBedroom(){
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(0, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuestConferenceRoom(){
        hotel.checkIn(guest, conferenceRoom);
        hotel.checkOut(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.getGuests().size());
    }
}
