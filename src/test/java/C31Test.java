

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
    private C31 c31;

    @Before
    public void before() {
       c31 = new C31();
    }

    @Test
    public void testm1() {
        assertEquals("m1", c31.m1());
    }
    @Test
    public void testm2() {
        assertEquals("m2", c31.m2());
    }}
