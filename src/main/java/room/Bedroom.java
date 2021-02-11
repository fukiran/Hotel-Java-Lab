package room;

public class Bedroom extends Room {
    private final RoomType roomType;

    public Bedroom(int capacity, int number, RoomType roomType) {
        super(capacity);
        this.roomType = roomType;
    }
}
