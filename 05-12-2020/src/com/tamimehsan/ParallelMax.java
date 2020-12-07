package com.tamimehsan;


class ParallelMax implements Runnable {
    int[] numbers;
    int maxNumber;

    ParallelMax() {
    }

    ParallelMax(int[] ints) {
        numbers = ints;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public void run() {
        maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            maxNumber = Math.max(maxNumber, numbers[i]);
        }
    }
}
