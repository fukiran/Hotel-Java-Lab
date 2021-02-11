package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
    public int guestListSize(){
        return this.guests.size();
    }
    public boolean isOccupied() {
        return this.guestListSize() > 0;
    }

    public boolean isVacant() {
        return this.guestListSize() == 0;
    }

}
