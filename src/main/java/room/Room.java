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


//    public RoomType getRoomType() {
//        return this.roomType;
//    }
//
//    public int getValueFromEnum() {
//        return this.roomType.getValue();
//    }


}
