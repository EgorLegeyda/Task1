package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.task1.entity.CustomArray;

import org.example.task1.service.ArrayService;
import org.example.task1.service.impl.ArrayServiceImpl;

public class Main {
    static Logger logger = LogManager.getLogger();

    static ArrayService arrayService = new ArrayServiceImpl();
    static final CustomArray basicArray1 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});

    //static ArraySortService sortService = new ArraySortServiceImpl();

    public static void main(String[] args) {
        /*logger.log(Level.INFO, "First log");
        logger.log(Level.ERROR, "first error");
        logger.info("old style");
        logger.warn("old style");*/

        for (int i = 0; i < basicArray1.length(); i++) {
            System.out.print(basicArray1.getElement(i) + " ");
        }


        System.out.println();

        System.out.println(arrayService.findMin(basicArray1));
        System.out.println(arrayService.findMax(basicArray1));
        System.out.println(arrayService.findAverage(basicArray1));
        System.out.println(arrayService.findNumMinus(basicArray1));
        System.out.println(arrayService.findSum(basicArray1));
    }
}