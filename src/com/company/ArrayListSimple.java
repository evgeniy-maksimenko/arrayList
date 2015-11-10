package com.company;

import java.util.ArrayList;

public class ArrayListSimple {
    public int[] list = {};

    private static void exception(int[] array) {
        if(array == null || array.length == 0)
            throw new IllegalArgumentException();
    }

    public int min() {
        exception(list);
        int result = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i] < result ) {
                result = list[i];
            }
        }
        return result;
            
    }

    public int max() {
        exception(list);
        int result = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i] > result ) {
                result = list[i];
            }
        }
        return result;
    }

    public int minInd() {
        exception(list);
        int result = list[0];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] < result ) {
                index = i;
            }
        }
        return index;
    }

    public int maxInd() {
        exception(list);
        int result = list[0];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > result ) {
                index = i;
            }
        }
        return index;
    }

    public void sort() {
        exception(list);
        int out, in;
        for(out=0;out<list.length;out++)   {
            for(in=0;in<list.length;in++){
                if(list[in] > list[out]) {
                    int tmp = list[in];
                    list[in] = list[out];
                    list[out] = tmp;
                }
            }
        }
    }

    public void print() {
        exception(list);
        for(int j=0;j<list.length;j++)
            System.out.print(list[j] + " ");
        System.out.println("");
    }

    public void reverse() {
        exception(list);

        for(int i = 0; i < list.length/2;i++){
            int tmp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = tmp;
        }
    }

    public void halfReverse() {
        exception(list);
        int halfArray = list.length / 2;
        int next = halfArray + list.length % 2;
        for(int i = 0; i < halfArray; i++) {
            int temp = list[i];
            list[i] = list[i+next];
            list[i+next] = temp;
        }
    }
    
    public int size(int itr) {
        exception(list);
        if(itr < list.length) {
            return size(itr+1);
        } else {
            return itr;
        }
    }
    
    public void set(int index, int element) {
        exception(list);
        list[index] = element;
    }

    public int get(int index) {
        exception(list);
        return list[index];
    }

    public void clear() {
        list = new int[1];
    }
    
    public void addPush(int element) {
        exception(list);
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH + 1];
        
        for (int i = 0; i < baseArray.length; i++) {
            if(i==0) {
                baseArray[0] = element;
            } else {
                baseArray[i] = list[i-1];
            }
        }
        list = new int[list.length+1];
        list = baseArray;
    }

    public void addPop(int element) {
        exception(list);
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH + 1];

        for (int i = 0; i < baseArray.length; i++) {
            
            if(i == LENGTH) {
                baseArray[i] = element;
            } else {
                baseArray[i] = list[i];
            }
        }
        list = new int[list.length+1];
        list = baseArray;
    }
    
    public void add(int index, int element) {
        exception(list);
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH + 1];
        
        
        for (int i = 0; i < baseArray.length; i++) {
            if (i<index) {
                baseArray[i] = list[i];
            }
            if(i == index) {
                baseArray[i] = element;
            } 
            if(i>index) {
                baseArray[i] = list[i-1];
            }
        }
        list = new int[list.length+1];
        list = baseArray;
    }
    
    public int delStart() {
        exception(list);
        int delElement = 0;
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++) {
            if(i==0) delElement = list[0];
            baseArray[i] = list[i+1];
            
        }
        list = new int[list.length-1];
        list = baseArray;
        return delElement;
    }

    public int delEnd() {
        exception(list);
        int delElement = 0;
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++) {
            if(i==0) delElement = list[LENGTH-1];
            baseArray[i] = list[i];

        }
        list = new int[list.length-1];
        list = baseArray;
        return delElement;
    }

    public int delIndex(int index) {
        exception(list);
        int delElement = 0;
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++) {
            if(i < index) baseArray[i] = list[i];
            
            if(i == index) delElement = list[index];
            
            if(i >= index) baseArray[i] = list[i+1];
        }
        list = new int[list.length-1];
        list = baseArray;
        return delElement;
    }
}