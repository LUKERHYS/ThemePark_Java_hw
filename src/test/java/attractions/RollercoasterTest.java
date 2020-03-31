package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 160.00, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    
    @Test
    public void isAllowedToPass(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
    
    @Test
    public void isAllowedToAgeFail(){
        Visitor visitor2 = new Visitor(10, 160.00, 50.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }
    
    @Test
    public void isAllowedToHeightFail(){
        Visitor visitor3 = new Visitor(18, 120.00, 50.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }
    
    
}
