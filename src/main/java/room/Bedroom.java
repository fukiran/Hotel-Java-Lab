package room;

import guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    private final RoomType roomType;
    private int number;
    private double nightlyRate;

    public Bedroom(int capacity, int number, RoomType roomType, double nightlyRate) {
        super(capacity);
        this.roomType = roomType;
        this.number = number;
        this.nightlyRate = nightlyRate;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

}
