package com.company;

interface ArrayList0Inter
{
    public int[] getList();

    public void init(int[] in);
    
    public int[] toArray() ;

    public int min() ;

    public int max();

    public int minInd();

    public int maxInd() ;

    public void sort() ;

    public void print() ;

    public void reverse() ;

    public void halfReverse() ;

    public int size();

    public void set(int index, int element) ;

    public int get(int index) ;

    public void clear();
    
    public void addPush(int element);

    public void addPop(int element) ;

    public void add(int index, int element);

    public int delStart();

    public int delEnd();

    public int delIndex(int index);
}
