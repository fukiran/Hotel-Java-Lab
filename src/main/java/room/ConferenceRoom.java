package room;

import guest.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;

    public ConferenceRoom(int capacity, String name, RoomType Double) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    }

