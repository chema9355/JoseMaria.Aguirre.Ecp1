

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
    private C51 c51;

    @Before
    public void before() {
       c51 = new C51();
    }

    @Test
    public void testm1() {
        assertEquals("m1", c51.m1());
    }
    @Test
    public void testm2() {
        assertEquals("m2", c51.m2());
    }}
