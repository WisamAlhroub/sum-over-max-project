package org.testteam.services;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class ListSumServiceTest {

    @Test
    public void testInitialization(){
        Integer[] set = new Integer[]{1, 3, 5, 2};
        ListSumService sumService = ListSumService.getInstance(List.of(set));
        assertArrayEquals(set, sumService.getNumbers());
    }

    @Test
    public void testSumMethod() {
        Integer[] set = new Integer[]{1, 3, 5, 2};
        ListSumService sumService = ListSumService.getInstance(List.of(set));
        assertEquals(11, sumService.sum());
    }

    @Test
    public void testSumMethodNegative() {
        Integer[] set = new Integer[]{-1, -3, -5, -2};
        ListSumService sumService = ListSumService.getInstance(List.of(set));
        assertEquals(-11, sumService.sum());
    }

}