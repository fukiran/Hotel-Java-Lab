import Booking.Booking;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 21, RoomType.DOUBLE, 75.50);
        booking = new Booking(2, bedroom);
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(2, booking.getNumberOfNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(151.00, booking.getTotalBill(), 0.01);
    }
}
