package org.testteam.services;

import java.util.Collections;
import java.util.List;

public class ListMaxService {
    private List<Integer> numbers;

    private ListMaxService(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ListMaxService getInstance(List<Integer> numbers) {
        ListMaxService maxService = null;
        return maxService = new ListMaxService(numbers);
    }

    public int[] getNumbers() {
        int[] set = new int[numbers.size()];
        for (int i =0; i<numbers.size();i++)
            set[i] = numbers.get(i);
        return set;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getMax() {
        return Collections.max(numbers);
    }
}
