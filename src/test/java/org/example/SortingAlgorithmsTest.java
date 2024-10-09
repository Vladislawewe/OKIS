package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class SortingAlgorithmsTest {

    private int[] unsortedArray;
    private int[] sortedArray;

    @BeforeMethod
    public void setUp() {
        unsortedArray = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        sortedArray = new int[]{1, 2, 3, 4, 5, 6, 10, 12};
    }

    @Test(groups = {"PositiveTest"})
    public void testBubbleSort() {
        SortingAlgorithms.bubbleSort(unsortedArray);
        Assert.assertEquals(unsortedArray, sortedArray, "Bubble Sort не корректен");
    }

    @Test(groups = {"PositiveTest"})
    public void testInsertionSort() {
        SortingAlgorithms.insertionSort(unsortedArray);
        Assert.assertEquals(unsortedArray, sortedArray, "Insertion Sort не корректен");
    }

    @Test(groups = {"null"}, expectedExceptions = NullPointerException.class)
    public void testInsertionSort_nullArray() {
        SortingAlgorithms.insertionSort(null);
    }


    @Test(groups = {"selectionSort"})
    public void testSelectionSort() {
        SortingAlgorithms.selectionSort(unsortedArray);
        Assert.assertEquals(unsortedArray, sortedArray, "Selection Sort не корректен");
    }

    @Test(groups = {"quickSort"})
    public void testQuickSort() {
        SortingAlgorithms.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        Assert.assertEquals(unsortedArray, sortedArray, "Quick Sort не корректен");
    }

    @Test(groups = {"mergeSort"})
    public void testMergeSort() {
        SortingAlgorithms.mergeSort(unsortedArray, 0, unsortedArray.length - 1);
        Assert.assertEquals(unsortedArray, sortedArray, "Merge Sort не корректен");
    }

    @Test(groups = {"null"}, expectedExceptions = NullPointerException.class)
    public void testMergeSort_nullArray() {
        SortingAlgorithms.mergeSort(null, 0, 0);
    }
}
