package org.testteam.services;

import java.util.List;

public class ListSumService {
    private List<Integer> numbers;

    private ListSumService(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ListSumService getInstance(List<Integer> numbers) {
        ListSumService sumService = null;
        return sumService = new ListSumService(numbers);
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

    public int sum() {
        int sum = 0;
        for (Integer number : numbers) sum += number;
        return sum;
    }
}
