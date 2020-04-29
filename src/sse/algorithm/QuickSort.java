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
public class QuickSort extends Sort{
    private int[] data;

    public QuickSort(int[] data) {
        this.data = data;
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
            sort(low,j);
        }
        if(i<high){
            sort(i,high);
        }
        
    }
    private void exchange(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j]=temp;
    }
    
    
}
