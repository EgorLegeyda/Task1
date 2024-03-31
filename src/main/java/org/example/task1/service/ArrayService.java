package org.example.task1.service;

import org.example.task1.entity.CustomArray;

public interface ArrayService {
    int findMax(CustomArray array);
    int findMin(CustomArray array);

    double findAverage(CustomArray array);

    int findSum(CustomArray array);

    int findNumMinus(CustomArray array);

    int[] replaceElement(CustomArray array, int el, int index);


}
