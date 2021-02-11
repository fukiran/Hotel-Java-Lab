package room;



import guest.Guest;

import java.util.ArrayList;

public abstract class Room {
//    private RoomType roomType;
    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity){
//        this.roomType = roomType;
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
    }


//    public RoomType getRoomType() {
//        return this.roomType;
//    }
//
//    public int getValueFromEnum() {
//        return this.roomType.getValue();
//    }


}
