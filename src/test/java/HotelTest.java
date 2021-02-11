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

    @Before
    public void before(){
        guest = new Guest("Bob");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, guests);

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasHotelBedRoom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms());
    }

//    @Test
//    public void hasRoomGuest() {
//        hotel.checkIn(guest, bedroom);
//        assertEquals(1, bedroom.s);
//    }
}
