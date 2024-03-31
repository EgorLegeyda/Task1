package org.example.task1.entity;



import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public int getElement(int index) {
        return array[index];
    }
    public int length() {
        return array.length;
    }


}
