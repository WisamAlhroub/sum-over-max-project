package org.testteam.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ListMaxServiceTest {
    @Test
    public void testInitialization(){
        int[] set = new int[]{1, 3, 5, 2};
        ListMaxService maxService;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length;i++) {
            list.add(set[i]);
        }
        maxService = ListMaxService.getInstance(list);
        Assertions.assertArrayEquals(set, maxService.getNumbers());
    }

    @Test
    public void testMaxMethod() {
        int[] set = new int[]{1, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length;i++) {
            list.add(set[i]);
        }
        ListMaxService maxService = ListMaxService.getInstance(list);
        Assertions.assertEquals(5, maxService.getMax());
    }
}