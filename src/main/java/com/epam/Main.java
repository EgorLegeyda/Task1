package com.epam;

import com.epam.array.entity.ArrayStatistics;
import com.epam.array.entity.ArrayWarehouse;
import com.epam.array.exception.ArrayException;
import com.epam.array.observer.ArrayStatisticsObserver;
import com.epam.array.observer.impl.ArrayStatisticsObserverImpl;
import com.epam.array.reader.ArrayReader;
import com.epam.array.reader.impl.ArrayReaderImpl;
import com.epam.array.repository.ArrayRepository;
import com.epam.array.repository.impl.ArrayRepositoryImpl;
import com.epam.array.repository.spec.impl.IdSpecification;
import com.epam.array.service.ArrayService;
import com.epam.array.service.ArraySortService;
import com.epam.array.service.impl.ArrayServiceImpl;
import com.epam.array.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();

    static ArrayService arrayService = new ArrayServiceImpl();
    static ArraySortService sortService = new ArraySortServiceImpl();
    static final CustomArray basicArray1 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray basicArray2 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray zeroArray = new CustomArray(new int[]{});


    public static void main(String[] args) throws ArrayException {


        ArrayReader arrayReader = new ArrayReaderImpl();

        List<int[]> arraysFromFile = arrayReader.readArray("data\\arrays.txt");

        ArrayRepository repository = new ArrayRepositoryImpl(new ArrayList<>());


        for (int[] i : arraysFromFile) {
            CustomArray tempCustomArray = new CustomArray(i);
            repository.add(tempCustomArray);
        }

        System.out.println(repository.toString());


        System.out.println(repository.get(2));



        CustomArray array1 = repository.get(2);

        arrayService.replaceElement(array1, 111, 0);

        System.out.println(repository.get(2));




    }
}