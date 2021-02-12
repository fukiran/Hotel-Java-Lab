package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int guestListSize(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if (this.guestListSize() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public void removeGuests(){
        guests.clear();
    }

    public boolean isOccupied() {
        return this.guestListSize() > 0;
    }

    public boolean isVacant() {
        return this.guestListSize() == 0;
    }

}
