package org.testteam.services;

import java.util.List;

public class ListSumService {
    private List<Integer> numbers;
    private static ListSumService sumService = null;

    private ListSumService(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ListSumService getInstance(List<Integer> numbers) {
        return sumService = new ListSumService(numbers);
    }

    public Integer[] getNumbers() {
        return numbers.toArray(Integer[]::new);
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
