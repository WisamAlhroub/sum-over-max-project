package org.testteam.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSumServiceTest {

    @Test
    public void testInitialization(){
        int[] set = new int[]{1, 3, 5, 2};
        ListSumService sumService;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length;i++) {
            list.add(set[i]);
        }
        sumService = ListSumService.getInstance(list);
        Assertions.assertArrayEquals(set, sumService.getNumbers());
    }

    @Test
    public void testSumMethod() {
        int[] set = new int[]{1, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length;i++) {
            list.add(set[i]);
        }
        ListSumService sumService = ListSumService.getInstance(list);
        Assertions.assertEquals(11, sumService.sum());
    }

    @Test
    public void testSumMethodNegative() {
        int[] set = new int[]{-1, -3, -5, -2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length;i++) {
            list.add(set[i]);
        }
        ListSumService sumService = ListSumService.getInstance(list);
        Assertions.assertEquals(-11, sumService.sum());
    }

}