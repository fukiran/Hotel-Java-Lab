package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import room.Room;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom>bedrooms, ArrayList<ConferenceRoom>conferenceRooms){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getBedrooms() {
        return bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkIn(Guest checkGuest, Room checkRoom) {
        checkRoom.addGuest(checkGuest);
    }

    public void checkOut( Room checkRoom) {
        checkRoom.removeGuests();
    }
}
