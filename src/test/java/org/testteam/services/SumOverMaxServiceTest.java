package org.testteam.services;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class SumOverMaxServiceTest {
    @Test
    public void testSumOverMaxMethod() {
        int[] set = new int[]{1, 3, 5, 2};
        ListSumService sumService;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<set.length; i++) {
            list.add(set[i]);
        }
        SumOverMaxService sumOverMaxService
                = new SumOverMaxService(ListSumService.getInstance(list), ListMaxService.getInstance(list));
        Assertions.assertEquals(11/5.0, sumOverMaxService.sumOverMax());
    }
}