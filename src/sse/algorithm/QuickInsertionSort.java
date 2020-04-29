/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sse.algorithm;

/**
 *
 * @author ASUS
 */
public class QuickInsertionSort extends Sort{
    private int[] data;
    private int threshold;

    public QuickInsertionSort(int[] data, int threshold) {
        this.data = data;
        this.threshold = threshold;
        System.out.println("Threshold: "+threshold);
    }
    public void sort(int low, int high){
        int i = low, j= high;
        int pivot = data[low+(high-low)/2];
        while(i<=j){
            while(data[i] <pivot){
                i++;
            }
            while(data[j] >pivot){
                j++;
            }
            if(i<=j){
                exchange(i,j);
                i++;
                j--;
            }
        }
        //recursion
        if(low<j){
            if(j-low <= threshold){
                InsertionSort(low,j);
            }else{
                sort(low,j);
            }
            
        }
        if(i<high){
            if(high-i <= threshold){
                InsertionSort(i,high);
            }else{
                sort(i,high);
            }
        }
        
    }
    public void InsertionSort(int start, int end) {
        int key, j;
        for (int i = start; i < end; i++) {
            key = data[i];
            j = i;
            while(j > 0 && data[j-1] > key){
                data[j] = data[j-1];
                j--;
            }
            data[j] = key;
        }
    }
    private void exchange(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j]=temp;
    }
    
    
}
