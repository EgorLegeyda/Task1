package org.example.task1.service.impl;

import org.example.task1.entity.CustomArray;
import org.example.task1.service.ArrayService;

public class ArrayServiceImpl implements ArrayService {
    @Override
    public int findMax(CustomArray array) {
        int max = array.getElement(0);
        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) > max){
                max = array.getElement(i);
            }
        }
        return max;
    }

    @Override
    public int findMin(CustomArray array) {
        int min = array.getElement(0);
        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) < min){
                min = array.getElement(i);
            }
        }
        return min;
    }

    @Override
    public double findAverage(CustomArray array) {
        double sum = 0;
        for (int i = 0; i < array.length(); i++) {
            sum += array.getElement(i);;
        }
        double average = sum/array.length();
        return average;
    }

    @Override
    public int findSum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.length(); i++) {
            sum += array.getElement(i);;
        }
        return sum;
    }

    @Override
    public int findNumMinus(CustomArray array) {
        int minusNum = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) < 0){
                minusNum += 1;
            }
        }
        return minusNum;
    }

    @Override
    public int[] replaceElement(CustomArray array, int el, int index) {
        int length = array.length();
        int[] newArray = new int[length];

        for (int i = 0; i < array.length(); i++) {
            if (i != index){
                newArray[i] = array.getElement(i);
            }else{
                newArray[i] = el;
            }
        }
        return newArray;
    }


}
