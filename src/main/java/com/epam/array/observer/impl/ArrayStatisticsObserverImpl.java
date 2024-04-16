package com.epam.array.observer.impl;

import com.epam.array.entity.ArrayStatistics;
import com.epam.array.entity.ArrayWarehouse;
import com.epam.array.entity.CustomArray;
import com.epam.array.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {

    @Override
    public void changeArrayElement(CustomArray array) {
        ArrayStatistics statistics= new ArrayStatistics(array);

        int id = array.getArrayId();
        ArrayWarehouse warehouse = ArrayWarehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
