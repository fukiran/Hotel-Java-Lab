import guest.Guest;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Bob");
    }
    @Test
    public void hasName() {
        assertEquals("Bob", guest.getName());
    }

    @Test
    public void canChangeName() {
        guest.setName("Rob");
        assertEquals("Rob",guest.getName());
    }
}