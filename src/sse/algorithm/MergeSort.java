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
public class MergeSort extends Sort{
    private int[] data;
    private int[] temp;

    public MergeSort(int[] data) {
        this.data = data;
        temp = new int[data.length];
    }
    public void sort(int left, int right){
        if(left >= right){
            return;
        }
        //the middle index of the range
        int mid = (left + right)/2;
        sort(left, right);
        sort(mid+1, right);
        int i=left;
        int j=mid+1;
        int k=left;
        boolean overLeft =false;
        boolean overRight = false;
        while(k<=right){
            if((overLeft==false)&&(data[i]<=data[j])){
                temp[k] = data[i];
                k++;
                i++;
                if(i==mid+1){
                    overLeft=true;
                    break;
                }
                continue;
                
            }
            if((overRight==false)&&(data[j]<=data[i])){
                temp[k] = data[j];
                k++;
                j++;
                if(j==right+1){
                    overRight=true;
                    break;
                }
                continue;
                
            }
        }
        if(overLeft){
            for(;j<right;j++,k++){
                temp[k]=data[j];
            }
        }
        if(overRight){
            for(;j<mid;i++,k++){
                temp[k]=data[i];
            }
        }
        for(int index = left; index < right;index++){
            data[index] = temp[index];
        }
    }
    
}
