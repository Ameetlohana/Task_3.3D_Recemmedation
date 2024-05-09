package sit707_tasks;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void testValidDate() {
	    DateUtil dateUtil = new DateUtil(15, 6, 2023);
	    assertEquals("15 June 2023", dateUtil.toString());
	}

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDay() {
        new DateUtil(32, 6, 2023);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMonth() {
        new DateUtil(15, 13, 2023);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidYear() {
        new DateUtil(15, 6, 1699);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDate() {
        new DateUtil(31, 2, 2023);
    }
}
