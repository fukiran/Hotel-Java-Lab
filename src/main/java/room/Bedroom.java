package room;

import guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    private final RoomType roomType;
    private int number;


    public Bedroom(int capacity, int number, RoomType roomType, ArrayList<Guest> guests) {
        super(capacity, guests);
        this.roomType = roomType;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
