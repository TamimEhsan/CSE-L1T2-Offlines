package com.tamimehsan;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        ParallelMax[] parallelMax = new ParallelMax[5];
        Thread[] threads = new Thread[parallelMax.length];
        int offset = numbers.length / parallelMax.length;
        for (int i = 0; i < parallelMax.length; i++) {
            parallelMax[i] = new ParallelMax(Arrays.copyOfRange(numbers, i * offset, (i + 1) * offset));
            threads[i] = new Thread(parallelMax[i]);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
                maxNumber = Math.max(maxNumber, parallelMax[i].getMaxNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(maxNumber);
    }
}