package com.lear.spring.basics.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    // Setter/no setter injection by taking Constructor out

    // public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    //     super();
    //     this.sortAlgorithm = sortAlgorithm;
    // }

    public int binarySearch(int[] number, int value) {
        // Bubble Sort Algorithm
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(number);
        System.out.println(sortAlgorithm);

        // Implement Search array
        // return result
        return value;
    }
}
