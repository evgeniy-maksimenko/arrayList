package com.company;

public class ArrayList0 implements ArrayList0Inter{
    public int[] list = {};
    
    public int[] getList() {
        return list;
    }

    @Override
    public void init(int[] in) {
        if(in == null) {
            in = new int[0];
        }
        list = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            list[i] = in[i];
        }
    }

    @Override
    public int[] toArray() {
        int[] in = new int[size()];
        for (int i = 0; i < size(); i++) {
            in[i] = list[i];
        }
        return in;
    }

    
    private void exception(int[] array) {
        if(array == null || array.length == 0)
            throw new IllegalArgumentException();
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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
    
    @Override
    public void print() {
        exception(list);

        for(int j=0;j<list.length;j++)
            System.out.print(list[j] + " ");
        System.out.println("");
    }

    @Override
    public void reverse() {
        exception(list);

        for(int i = 0; i < list.length/2;i++){
            int tmp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = tmp;
        }
    }
    
    @Override
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
    
    @Override
    public int size() {
        return list.length;
    }

    @Override
    public void set(int index, int element) {
        exception(list);
        list[index] = element;
    }

    @Override
    public int get(int index) {
        exception(list);
        return list[index];
    }

    @Override
    public void clear() {
        list = new int[0];
    }

    @Override
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

        list = baseArray;
    }

    @Override
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

        list = baseArray;
    }

    @Override
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

        list = baseArray;
    }

    @Override
    public int delStart() {
        exception(list);
        int delElement = list[0];
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++)
            baseArray[i] = list[i+1];

        list = baseArray;
        return delElement;
    }

    @Override
    public int delEnd() {
        exception(list);
        int LENGTH = list.length;
        int delElement = list[LENGTH-1];
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = list[i];

        }

        list = baseArray;
        return delElement;
    }

    @Override
    public int delIndex(int index) {
        exception(list);
        int delElement = list[index];
        int LENGTH = list.length;
        int[] baseArray = new int[LENGTH - 1];

        for (int i = 0; i < baseArray.length; i++) {
            if(i < index) baseArray[i] = list[i];
            
            if(i >= index) baseArray[i] = list[i+1];
        }
        list = baseArray;
        return delElement;
    }
}
