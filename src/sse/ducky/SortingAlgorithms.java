/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sse.ducky;

import java.io.Serializable;
import sse.algorithm.InsertionSort;
import sse.algorithm.MergeSort;
import sse.algorithm.QuickInsertionSort;
import sse.algorithm.QuickSort;
import sse.algorithm.Sort;

public class SortingAlgorithms implements Serializable{
    private int[] array;
    private int threshold;

    public SortingAlgorithms(int[] array) {
        this.array = array;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    
    public String insertionSort(){
        int[] temp = copyData();
        long start = getTime();
        InsertionSort algorithm = new InsertionSort(temp);
        algorithm.sort();
        long end = getTime();
        //        System.out.println("End "+end);
        long duration = end-start;
        if(duration <5000000){
            return duration +" ns";
        }else{
            return (long)(duration/1000000) +" ns";
        }
    }
    
    public String mergeSort(){
        int[] temp = copyData();
//        display(temp);
        long start = getTime();
        MergeSort algorithm = new MergeSort(temp);
        algorithm.sort(0,temp.length-1);
        long end = getTime();
        long duration = end-start;
        if(duration <5000000){
            return duration +" ns";
        }else{
            return (long)(duration/1000000) +" ns";
        }
    }
    
    public String quickSort(){
        int[] temp = copyData();
        long start = getTime();
        QuickSort algorithm = new QuickSort(temp);
        algorithm.sort(0,temp.length-1);
        long end = getTime();
        long duration = end-start;
        if(duration <5000000){
            return duration +" ns";
        }else{
            return (long)(duration/1000000) +" ns";
        }
    }
    
    public String quickInsertionSort(){
        int[] temp = copyData();
        long start = getTime();
        QuickInsertionSort algorithm = new QuickInsertionSort(temp, getThreshold());
        algorithm.sort(0, temp.length-1);
        long end = getTime();
        long duration = end-start;
        if(duration <5000000){
            return duration +" ns";
        }else{
            return (long)(duration/1000000) +" ns";
        }
    }
    
    public long getTime(){
        return System.nanoTime();
    }
    
    private int[] copyData(){
        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }
//    public static void main(String[] args) {
//        int size = 2000;
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random()*array.length*array.length);
//            
//        }
//    }
}
