package com.company;

interface Sorting {

    void sort(int[] arr);
}

class Sorter {

    Sorting srategy;

    public void sortSrategy(Sorting srategy) {
        this.srategy = srategy;
    }

    public void execute(int[] arr) {
        srategy.sort(arr);
    }
}