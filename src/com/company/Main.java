package com.company;


public class Main {

    public static void main(String[] args) {
        
        ArrayListSimple arrayListSimple = new ArrayListSimple();
        arrayListSimple.list = new int[] {120, 340, 292, 33, 24};
        arrayListSimple.min();
        arrayListSimple.max();
        arrayListSimple.minInd();
        arrayListSimple.maxInd();
        arrayListSimple.sort();
        arrayListSimple.reverse();

        arrayListSimple.halfReverse();
        arrayListSimple.size(0);
        arrayListSimple.set(1, 100);
        arrayListSimple.get(2);
//        arrayListSimple.clear();


//        arrayListSimple.print();
        arrayListSimple.addPush(67);
        arrayListSimple.addPush(167);
        arrayListSimple.addPop(1000);
        arrayListSimple.addPop(12000);

        arrayListSimple.add(2, 12000);
        arrayListSimple.add(2, 42000);
        
        arrayListSimple.add(2, 62000);
        arrayListSimple.print();
//        System.out.println(arrayListSimple.delStart());
        System.out.println(arrayListSimple.delIndex(11));
        arrayListSimple.print();
    }
}
